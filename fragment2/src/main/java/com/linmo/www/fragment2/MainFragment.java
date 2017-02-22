package com.linmo.www.fragment2;
//Fragment选择android.support.v4.app.Fragment;为了兼容3.0以下的版本1.6+

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by linmo on 2017/2/18.
 */

public class MainFragment extends Fragment {
    //创建onCreateView方法覆盖系统的onCreateView
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //传入创建的fragment界面
        View view = inflater.inflate(R.layout.fragmet_main, container);


        return view;
    }
}
