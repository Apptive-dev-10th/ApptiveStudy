package com.example.withk.week3_kohsan;

public class ListViewItem {

    private String name;
    private String statusmessage;


    public ListViewItem(String name, String statusmessage) {
        this.name = name;
        this.statusmessage = statusmessage;
    }


    public String getName() {
        return name;
    }

    public String getStatusmessage() {
        return statusmessage;
    }
}
