package com.linmo.www.gridview_baseadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<MenuItem> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridViewMenu = (GridView) findViewById(R.id.grid_view_menu);
        dataList = new ArrayList<>();
        dataList.add(new MenuItem("菜单一",R.drawable.brain));
        dataList.add(new MenuItem("菜单二",R.drawable.breast));
        dataList.add(new MenuItem("菜单三",R.drawable.car));

        //定义一个实例使用MenuAdapter
        MenuAdapter menuAdapter = new MenuAdapter();
        gridViewMenu.setAdapter(menuAdapter);
    }

    class MenuAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return dataList.size();
        }

        @Override
        public Object getItem(int position) {
            return dataList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //生成菜单内容
            View menuView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, null);
            //设置菜单值
            TextView tvMenuname = (TextView) findViewById(R.id.tv_menu);
            tvMenuname.setText(dataList.get(position).menuName);
            ImageView imageViewMenu = (ImageView) findViewById(R.id.image_menu);
            imageViewMenu.setImageResource(dataList.get(position).menuDrawableId);


            return menuView;
        }
    }

    class MenuItem {
        String menuName;
        int menuDrawableId;
        //构造一个函数
        MenuItem(String menuName, int menuDrawableId) {
            this.menuDrawableId = menuDrawableId;
            this.menuName = menuName;
        }
    }


}
