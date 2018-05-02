package com.example.yuri.myapplication;

/**
 * Created by yuri on 2018. 4. 28..
 */

public class ListViewItem {
    int image;
    String name, message;
    String chatName, lastWords, time;

    public ListViewItem(int image, String name, String message) {
        this.image = image;
        this.name = name;
        this.message = message;
    }

    public ListViewItem(int image, String chatName, String lastWords, String time) {
        this.image = image;
        this.chatName = chatName;
        this.lastWords = lastWords;
        this.time = time;
    }

    public int getImage(){return image;}
    public String getName(){return name;}
    public String getMessage( ){return message;}


    public String getChatName( ){return chatName;}
    public String getLastWords( ){return lastWords;}
    public String getTime( ){return time;}

}
