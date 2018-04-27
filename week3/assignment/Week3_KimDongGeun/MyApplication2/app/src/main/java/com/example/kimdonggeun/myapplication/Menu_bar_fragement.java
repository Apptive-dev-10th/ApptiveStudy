package com.example.kimdonggeun.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kim Dong Geun on 2018-04-27.
 */

public class Menu_bar_fragement extends Fragment {

    public Menu_bar_fragement(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){



        View root=inflater.inflate(R.layout.menu_bar,container,false);




        return root;
    }

}
