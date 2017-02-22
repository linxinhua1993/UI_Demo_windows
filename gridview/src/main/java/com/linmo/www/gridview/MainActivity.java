package com.linmo.www.gridview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
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
        GridView gridViewMenu = (GridView) findViewById(R.id.grid_view_menu);
        List<Map<String, String>> dataList = new ArrayList<>();
        //方法一
//        for (int i = 0; i < 50; i++) {
//            Map<String, String> map = new HashMap<>();
//            map.put("menu_name", "菜单" + i);
//
//            dataList.add(map);
//        }
        //方法二
//        Map<String,String> map=new HashMap<>();
//        map.put("menu_name","省钱检查");
//        dataList.add(map);
//        Map<String,String> map2=new HashMap<>();
//        map.put("menu_name","省钱检查");
//        dataList.add(map);
//        Map<String,String> map3=new HashMap<>();
//        map.put("menu_name","省钱检查");
//        dataList.add(map);
        //方法三，map的有效期只在{}口号内。map不用改名
        {
            Map<String, String> map = new HashMap<>();
            map.put("menu_name", "省钱检查");
            dataList.add(map);
        }
        {
            Map<String, String> map = new HashMap<>();
            map.put("menu_name", "省钱检查");
            dataList.add(map);
        }
        {
            Map<String, String> map = new HashMap<>();
            map.put("menu_name", "省钱检查");
            dataList.add(map);
        }
        {
            Map<String, String> map = new HashMap<>();
            map.put("menu_name", "省钱检查");
            dataList.add(map);
        }


        String[] from = {"menu_name"};
        int[] to = {R.id.tv_menu};
        //SimpleAdapter不能满足菜单图标的是设置
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, dataList, R.layout.grid_item, from, to);

        gridViewMenu.setAdapter(simpleAdapter);

    }
}
