package com.example.kimtaehyeong.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class ThirdFragment extends android.support.v4.app.Fragment
{
    public ThirdFragment()
    {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_third,container,false);
       return layout;
    }
}