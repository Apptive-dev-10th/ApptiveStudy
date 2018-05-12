package com.example.yuri.myapplication;

/**
 * Created by yuri on 2018. 5. 12..
 */

public class CardData {
    private int image;
    private String name;

    CardData(int image, String name){
        this.image = image;
        this.name = name;
    }

    public int getImage(){
        return image;
    }
    public String getName(){
        return name;
    }
}
