package com.example.kimdonggeun.myapplication;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by Kim Dong Geun on 2018-04-27.
 */

public class Profile {



    private String pro_name;
    private int img_name;
    private String str_balloon;

    public Profile() {

    }

    public Profile(String pro_name, int img_name) {
        this.pro_name = pro_name;
        this.img_name = img_name;
    }

    public Profile(String pro_name, int img_name, String str_balloon) {
        this.pro_name = pro_name;
        this.img_name = img_name;
        this.str_balloon = str_balloon;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public int getImg_name() {
        return img_name;
    }

    public void setImg_name(int img_name) {
        this.img_name = img_name;
    }

    public String getStr_balloon() {
        return str_balloon;
    }

    public void setStr_balloon(String str_balloon) {
        this.str_balloon = str_balloon;
    }
}
