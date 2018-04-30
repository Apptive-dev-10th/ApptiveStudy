package com.example.kimdonggeun.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kim Dong Geun on 2018-04-27.
 */

public class Search_Bar_fragment extends Fragment{


    public Search_Bar_fragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View root=inflater.inflate(R.layout.search_bar,container,false);
    return root;
    }

}
