package com.linmo.www.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("菜单1");
        menu.add("菜单2");
        menu.add("菜单3");
        menu.add("菜单4");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getTitle().equals("菜单1")){
            Toast.makeText(this,"用户点击了"+item.getTitle(),Toast.LENGTH_SHORT).show();
        }else if (item.getTitle().equals("菜单2")){
            Toast.makeText(this,"用户点击了"+item.getTitle(),Toast.LENGTH_SHORT).show();
        }else if (item.getTitle().equals("菜单3")){
            Toast.makeText(this,"用户点击了"+item.getTitle(),Toast.LENGTH_SHORT).show();
        }else if (item.getTitle().equals("菜单4")){
            Toast.makeText(this,"用户点击了"+item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
