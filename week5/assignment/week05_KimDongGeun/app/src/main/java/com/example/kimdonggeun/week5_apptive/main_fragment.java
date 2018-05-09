package com.example.kimdonggeun.week5_apptive;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * Created by Kim Dong Geun on 2018-05-06.
 */

public class main_fragment extends Fragment {

    public main_fragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.main_frag, container, false);


        View tabView1 = getLayoutInflater().inflate(R.layout.tablayout_tabitem, null);
        ImageView tabimage1 = (ImageView)tabView1.findViewById(R.id.tab_image);
        TextView tabid1= (TextView)tabView1.findViewById(R.id.tab_id);
        tabimage1.setImageResource(R.drawable.tab1);
        tabid1.setText("오늘의 카드");

        View tabView2 = getLayoutInflater().inflate(R.layout.tablayout_tabitem, null);
        ImageView tabimage2 = (ImageView)tabView2.findViewById(R.id.tab_image);
        TextView tabid2= (TextView)tabView2.findViewById(R.id.tab_id);
        tabimage2.setImageResource(R.drawable.tab2);
        tabid2.setText("카드 리스트");

        View tabView3 = getLayoutInflater().inflate(R.layout.tablayout_tabitem, null);
        ImageView tabimage3 = (ImageView)tabView3.findViewById(R.id.tab_image);
        TextView tabid3= (TextView)tabView3.findViewById(R.id.tab_id);
        tabimage3.setImageResource(R.drawable.tab3);
        tabid3.setText("메세지");

        View tabView4 = getLayoutInflater().inflate(R.layout.tablayout_tabitem, null);
        ImageView tabimage4 = (ImageView)tabView4.findViewById(R.id.tab_image);
        TextView tabid4= (TextView)tabView4.findViewById(R.id.tab_id);
        tabimage4.setImageResource(R.drawable.tab2);
        tabid4.setText("프로필");


        final TabLayout mTabLayout = (TabLayout)root.findViewById(R.id.menu_tabs);
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(tabView1));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(tabView2));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(tabView3));
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(tabView4));

        final ViewPager viewPager=(ViewPager)root.findViewById(R.id.viewpager);
        viewPager.setAdapter(new menuPageAdapter(getActivity().getSupportFragmentManager()));

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