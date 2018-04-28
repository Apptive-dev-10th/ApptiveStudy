package com.example.kimdonggeun.myapplication;


import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Kim Dong Geun on 2018-04-27.
 */

public class Friends_List_fragement extends ListFragment {


    public Friends_List_fragement(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){


        Profile_Adpater adapter = new Profile_Adpater();
        setListAdapter(adapter);
        for(int i=0;i<3;i++) {
            adapter.additem("김동근", R.drawable.man);
            adapter.additem("김당근", R.drawable.man);
            adapter.additem("김당궈", R.drawable.man);
        }

        return super.onCreateView(inflater,container,savedInstanceState);

    }

}
