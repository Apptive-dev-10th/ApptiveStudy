package com.example.withk.wee4_kohsan;

import android.graphics.drawable.Drawable;

public class ListViewItemFriends {

    private int image;
    private String name;
    private String statusmessage;


    public ListViewItemFriends(int image, String name, String statusmessage) {
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
