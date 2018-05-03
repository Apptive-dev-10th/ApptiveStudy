package com.example.yuri.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuri on 2018. 4. 28..
 */

public class pagerAdapter extends FragmentPagerAdapter{

//    private List<Fragment> fragments = new ArrayList<>();
//    private List<String> fragmentsTitle = new ArrayList<>();
    private List<TabInfo> tabInfoList = new ArrayList<>();

    public pagerAdapter(FragmentManager fm) {
        super(fm);
    }

//    public void addFragment(Fragment fm, String title){
//        fragments.add(fm);
//        fragmentsTitle.add(title);
//    }

    public void addFragment(Fragment fm, int iconResId) {
        tabInfoList.add(new TabInfo(fm, iconResId));
    }
//
//    @Override
//    public CharSequence getPageTitle(int position) {
//
////        return fragmentsTitle.get(position);
//        return null;
//    }
//
//    @Override
//    public Fragment getItem(int position) {
//        return fragments.get(position);
//    }
//
//    @Override
//    public int getCount() {
//        return fragments.size();
//    }



    public TabInfo getTabInfo(int position) {
        return tabInfoList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return tabInfoList.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return tabInfoList.size();
    }


}
