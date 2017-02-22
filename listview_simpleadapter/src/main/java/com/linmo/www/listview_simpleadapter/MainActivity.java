package com.linmo.www.listview_simpleadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView demoListView = (ListView) findViewById(R.id.dome_list_view);

        List<Map<String, ?>> dataList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Map<String, String> map = new HashMap<>();

            map.put("name", "张三" + i);
            map.put("sex", i % 2 == 0 ? "男" : "女");
            map.put("age", 10 + i + "");

            dataList.add(map);

        }
        String[] from = {"name", "age", "sex"};
        int[] to = {R.id.tv_name, R.id.tv_age, R.id.tv_sex};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, dataList, R.layout.item_userinfo,from,to );
        demoListView.setAdapter(simpleAdapter);
    }
}
