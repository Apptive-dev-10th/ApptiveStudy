package com.example.withk.wee4_kohsan;

import android.graphics.drawable.Drawable;

public class ListViewItemChatting {

    private int image1;
    private String name1;
    private String message;


    public ListViewItemChatting(int image1, String name1, String message) {
        this.image1 = image1;
        this.name1 = name1;
        this.message = message;
    }

    public int getImage1() {
        return image1;
    }

    public String getName1() {
        return name1;
    }

    public String getMessage() {
        return message;
    }
}
