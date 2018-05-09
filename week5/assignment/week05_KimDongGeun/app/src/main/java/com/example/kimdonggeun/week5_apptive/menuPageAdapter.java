package com.example.kimdonggeun.week5_apptive;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Kim Dong Geun on 2018-05-06.
 */

public class menuPageAdapter extends FragmentPagerAdapter {
    private int tap_count;

    public menuPageAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position){
        switch(position){
            case 0:
                person_choice person_choice = new person_choice();
                return person_choice;
            case 1:
                //return new Friends_List_fragement();
                cardList_fragment cardlist = new cardList_fragment();
                return cardlist;
            case 2:
                //return new Friends_List_fragement();
                return new Fragment();
            case 3:
                //return new Friends_List_fragement();
                return new Fragment();
            default:
                return null;
        }

    }
    @Override
    public int getCount(){
        return 4;
    }


}
