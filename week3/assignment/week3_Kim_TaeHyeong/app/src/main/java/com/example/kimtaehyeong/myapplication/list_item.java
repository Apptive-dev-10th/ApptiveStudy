package com.example.kimtaehyeong.myapplication;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class list_item {
    private Drawable iconDrawable;
    private  String titleStr;
    private  String descStr;

    public void setIcon(Drawable icon)  {
        iconDrawable=icon;
    }
    public void setTitle(String title) {
        descStr = title;
    }
    public void setDesc(String desc) {
        descStr=desc;
    }

    public Drawable getIcon() {
        return this.iconDrawable;
    }

    public String getTitle() {
        return this.titleStr;
    }
    public String getDescStr() {
        return this.descStr;
    }
}
