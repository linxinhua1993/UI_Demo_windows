package com.linmo.www.viewpager;

import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager myViewPager;
    List<View> viewList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewPager = (ViewPager) findViewById(R.id.my_view_pager);
        //第一页引导页
        {
            //获取单个View的图片
            View view = LayoutInflater.from(this).inflate(R.layout.item_view_pager, null);
            //获取Image View并改变背景色
            ImageView imageView = (ImageView) findViewById(R.id.item_image_view);
            imageView.setBackgroundColor(Color.RED);
            viewList.add(view);
        }
        //第二页引导页
        {
            View view = LayoutInflater.from(this).inflate(R.layout.item_view_pager, null);
            ImageView imageView = (ImageView) findViewById(R.id.item_image_view);
            imageView.setBackgroundColor(Color.GREEN);
            viewList.add(view);
        }
        //第三页引导页
        {
            View view = LayoutInflater.from(this).inflate(R.layout.item_view_pager, null);
            ImageView imageView = (ImageView) findViewById(R.id.item_image_view);
            imageView.setBackgroundColor(Color.BLUE);
            viewList.add(view);
        }
        //把引导页设置到view上
        myViewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return viewList.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view==object;
            }
            //初始化指定未知数的view对象

            @Override
            //position是当前的View Pager所滑动到页码
            public Object instantiateItem(ViewGroup container, int position) {
                container.addView(viewList.get(position));
                return viewList.get(position);
            }
            //当ViewPager滑过去之后销毁之前的view对象
            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(viewList.get(position));
            }
        });
    }
}
