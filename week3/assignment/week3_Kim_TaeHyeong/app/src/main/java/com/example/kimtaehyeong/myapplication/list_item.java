package com.example.kimtaehyeong.myapplication;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class list_item {
    private Drawable icon;
    private  String name;
    private  String statusmesg;

    public Drawable getIcon() { return icon;}
    public void setIcon(Drawable icon) {this.icon=icon;}

    public String getName() {return name;}
    public void setName(String name) {this.name=name;}

    public String getStatusmesg() {return statusmesg=statusmesg;}
    public void setStatusmesg(String statusmesg) {this.statusmesg=statusmesg;}

}
