package com.example.kimdonggeun.week5_apptive;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kim Dong Geun on 2018-05-06.
 */

public class up_bar extends Fragment{


    public up_bar() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.up_bar, container, false);
        return root;

    }


}
