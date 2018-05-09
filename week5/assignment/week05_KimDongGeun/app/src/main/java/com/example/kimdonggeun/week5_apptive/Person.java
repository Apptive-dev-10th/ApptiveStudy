package com.example.kimdonggeun.week5_apptive;

/**
 * Created by Kim Dong Geun on 2018-05-06.
 */

public class Person {

    private int img_src;
    private String name;
    private int age;
    private String location;

    public Person(int img_src, String name, int age, String location) {
        this.img_src = img_src;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public int getImg_src() {
        return img_src;
    }

    public void setImg_src(int img_src) {
        this.img_src = img_src;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
