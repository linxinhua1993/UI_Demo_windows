package com.linmo.www.listview_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] strings = {"小学一年级",
            "小学一年级",
            "小学一年级",
            "小学一年级",
            "小学一年级",
            "小学一年级",
            "gz一年级",
            "gz一年级",
            "gz一年级",
            "gz一年级",
            "小学一年级",
            "大学一年级",
            "小学一年级",
            "小学一年级",
            "小学一年级",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView demoListView = (ListView) findViewById(R.id.dome_list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, strings);
        demoListView.setAdapter(adapter);
    }
}
