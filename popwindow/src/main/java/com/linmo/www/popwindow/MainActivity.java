package com.linmo.www.popwindow;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    PopupWindow popupWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //给popwindow设置点击事件
        findViewById(R.id.btn_pop_window).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                popupWindow.showAsDropDown(v);//无法实现居中显示
                popupWindow.showAtLocation(MainActivity.this.getWindow().getDecorView(), Gravity.CENTER,0,0);//居中显示的方法
           }
        });
        //初始化popupWindow，创建view传入
        View view= LayoutInflater.from(this).inflate(R.layout.pop_window,null);
        ((TextView)view.findViewById(R.id.tv_title)).setText("标题");
        ((TextView)view.findViewById(R.id.tv_msg)).setText("这里是popupWindow显示的内容");

        //设置按钮监听
        view.findViewById(R.id.btn_ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //设置点击后显示的语句
                Toast.makeText(v.getContext(),"您点了确定按钮",Toast.LENGTH_SHORT).show();
                popupWindow.dismiss();
            }
        });
        view.findViewById(R.id.btn_cancle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //设置点击后显示的语句
                Toast.makeText(v.getContext(),"您点了取消按钮",Toast.LENGTH_SHORT).show();
                popupWindow.dismiss();
            }
        });


        popupWindow =new PopupWindow(view, WindowManager.LayoutParams.WRAP_CONTENT,WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setFocusable(true);
    }
}
