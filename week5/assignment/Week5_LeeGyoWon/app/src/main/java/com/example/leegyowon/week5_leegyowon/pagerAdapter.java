package com.example.leegyowon.week5_leegyowon;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class pagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mFragments = new ArrayList<>();
    private List<String> mFragmentTitles = new ArrayList<>();

    public pagerAdapter(FragmentManager fm) { super(fm); }
    public void addFragment(Fragment fragment, String title) {
        mFragments.add(fragment);
        mFragmentTitles.add(title);
    }

    @Override
    public Fragment getItem(int position) { return mFragments.get(position); }
    @Override
    public int getCount() { return mFragments.size(); }
    @Override
    public CharSequence getPageTitle(int position) { return mFragmentTitles.get(position); }
}
