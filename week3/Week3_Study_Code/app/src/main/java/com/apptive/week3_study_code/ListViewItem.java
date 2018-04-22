package com.apptive.week3_study_code;

/**
 * List View Item Model
 * */
public class ListViewItem {

    /**
     * Field variable
     * */
    private String title;
    private String subTitle;

    /**
     * Constructor
     * */
    public ListViewItem(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
    }

    /**
     * get Method
     * */
    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }
}
