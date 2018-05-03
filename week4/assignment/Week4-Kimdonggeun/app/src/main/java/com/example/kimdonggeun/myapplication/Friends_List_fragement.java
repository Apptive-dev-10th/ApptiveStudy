package com.example.kimdonggeun.myapplication;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
            adapter.additem("김동근", R.drawable.man,"안녕");
            adapter.additem("김당근", R.drawable.user,"하이");
            adapter.additem("김당궈", R.drawable.man,"안녕하세요");
        }

        return super.onCreateView(inflater,container,savedInstanceState);

    }

}
