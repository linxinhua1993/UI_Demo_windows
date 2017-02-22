package com.linmo.www.menu2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //调用自己创建的方法
        setIconEnable(menu, true);
        new MenuInflater(this).inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //菜单的响应事件


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.main_menu_1:  //是冒号
                //处理第一个菜单的点击事件
                break;
            case R.id.main_menu_2:
                //TODO
                break;
            case R.id.main_menu_3:
                //TODO
                break;
            case R.id.main_menu_4:
                //TODO
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    //enable为true时，菜单添加图标有效，enable为false时无效，4.0系统默认无效
    public void setIconEnable(Menu menu, boolean enable) {
        //获取系统特性
        try {
            Class<?> clazz = Class.forName("com.android.internal.view.menu.MenuBuilder");
            Method m = clazz.getDeclaredMethod("setOptionalIconsvisible", boolean.class);
            m.setAccessible(true);
            //MenuBuilder实现menu接口，创建菜单时，传进来的menu其实时MenuBuilder对象（java的多态特征）
            m.invoke(menu, enable);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
