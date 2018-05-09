package com.example.kimdonggeun.week5_apptive;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Kim Dong Geun on 2018-04-27.
 */

public class Person_Adapter extends BaseAdapter {

    private ArrayList<Person> items=new ArrayList<Person>();

    public Person_Adapter(){

    }

    @Override
    public int getCount(){return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final int pos=position;
        final Context context=parent.getContext();

        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.cardlist_item,parent,false);
        }

        Person person = items.get(position);

        ImageView person_img = (ImageView) convertView.findViewById(R.id.cardlist_personimg);
        TextView person_name = (TextView) convertView.findViewById(R.id.cardlist_personname);

        person_img.setImageResource(person.getImg_src());
        person_name.setText(person.getName());

//        ImageView Person_img = (ImageView) convertView.findViewById(R.id.person_img);
//        TextView Person_name = (TextView)convertView.findViewById(R.id.person_name);
//        TextView Person_age = (TextView)convertView.findViewById(R.id.person_age);
//        TextView Person_location = (TextView)convertView.findViewById(R.id.person_location);
//
//
//        Person_img.setImageResource(person.getImg_src());
//        Person_name.setText(person.getName());
//        Person_age.setText(person.getAge());
//        Person_location.setText(person.getLocation());

                return convertView;
    }


    public void additem(String name,int img_name,int Person_age,String Person_location){
        Person person = new Person(img_name,name,Person_age,Person_location);

        items.add(person);

    }


}
