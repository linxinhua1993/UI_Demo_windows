package com.linmo.www.baseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Userinfo> dateList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView demoListView = (ListView) findViewById(R.id.dome_list_view);
        dateList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Userinfo userinfo = new Userinfo();
            userinfo.name = "张三" + i;
            userinfo.age = 10 + i;
            userinfo.sex = i % 2 == 0 ? "男" : "女";
            dateList.add(userinfo);
        }
        UserInfolistAdapter userInfolistAdapter = new UserInfolistAdapter();
        demoListView.setAdapter(userInfolistAdapter);
    }

    class UserInfolistAdapter extends BaseAdapter {

        //用于返回，有多少个数据需要返回
        @Override
        public int getCount() {
            return dateList.size();
        }

        //返回指定数据int position的数据
        @Override
        public Object getItem(int position) {
            return dateList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        //添加所有生成view的方法
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itmeRootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_userinfo, null);

            TextView tvName = (TextView) itmeRootView.findViewById(R.id.tv_name);
            tvName.setText(dateList.get(position).name);
            TextView tvAge = (TextView) itmeRootView.findViewById(R.id.tv_age);
            tvAge.setText(dateList.get(position).age + "");
            TextView tvSex = (TextView) itmeRootView.findViewById(R.id.tv_sex);
            tvSex.setText(dateList.get(position).sex);

            return itmeRootView;
        }
    }

    class Userinfo {
        String name;
        int age;
        String sex;
    }

    ;
}
