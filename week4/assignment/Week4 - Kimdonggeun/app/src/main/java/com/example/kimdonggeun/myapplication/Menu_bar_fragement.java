package com.example.kimdonggeun.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
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



        View root=inflater.inflate(R.layout.menu_tab,container,false);


        final TabLayout mTabLayout = (TabLayout)root.findViewById(R.id.menu_tabs);
        mTabLayout.addTab(mTabLayout.newTab().setText("Friends"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Chatting"));
        mTabLayout.addTab(mTabLayout.newTab().setText("News pids"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Settings"));

        final ViewPager viewPager=(ViewPager)root.findViewById(R.id.viewpager);
        viewPager.setAdapter(new Menupageadapter(getActivity().getSupportFragmentManager()));

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));


        return root;


    }


}
