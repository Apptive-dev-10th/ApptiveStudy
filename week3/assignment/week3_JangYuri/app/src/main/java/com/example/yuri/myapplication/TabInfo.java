package com.example.yuri.myapplication;

import android.support.v4.app.Fragment;

/**
 * Created by yuri on 2018. 5. 1..
 */

public class TabInfo {
    private int iconResId;
    private Fragment fragment;

    public TabInfo(Fragment fragment, int iconResId) {
        this.fragment = fragment;
        this.iconResId = iconResId;
    }

    public int getIconResId() {
        return iconResId;
    }

    public Fragment getFragment() {
        return fragment;
    }

}
