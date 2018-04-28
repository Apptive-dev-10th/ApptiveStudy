package com.example.kimdonggeun.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Kim Dong Geun on 2018-04-28.
 */

public class Menupageadapter extends FragmentPagerAdapter {
    Friends_List_fragement tab1= new Friends_List_fragement();
    Fragment temp=new Fragment();

    public Menupageadapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        switch(position){
            case 0:
                return tab1;
            case 1:
                return temp;
            default:
                return null;
        }

    }
    @Override
    public int getCount(){
        return 0;
    }
}
