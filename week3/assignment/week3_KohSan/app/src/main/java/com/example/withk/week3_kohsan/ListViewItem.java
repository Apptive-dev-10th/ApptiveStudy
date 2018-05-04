package com.example.withk.week3_kohsan;

import android.graphics.drawable.Drawable;

public class ListViewItem {

    private int image;
    private String name;
    private String statusmessage;


    public ListViewItem(int image, String name, String statusmessage) {
        this.image = image;
        this.name = name;
        this.statusmessage = statusmessage;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getStatusmessage() {
        return statusmessage;
    }
}
