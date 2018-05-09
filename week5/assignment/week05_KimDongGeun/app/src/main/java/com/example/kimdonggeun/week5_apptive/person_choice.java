package com.example.kimdonggeun.week5_apptive;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Kim Dong Geun on 2018-05-06.
 */

public class person_choice extends android.support.v4.app.Fragment {

    Person person1,person2;

    public person_choice() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View root = inflater.inflate(R.layout.choose_person, container, false);


        person1=new Person(R.drawable.boy,"김동근",25,"부산");
        person2=new Person(R.drawable.girl,"김당근",25,"거제");

        ImageView img1 = (ImageView)root.findViewById(R.id.person1_img);
        TextView name1 = (TextView)root.findViewById(R.id.person1_name);
        TextView age1 = (TextView) root.findViewById(R.id.person1_age);
        TextView location1= (TextView)root.findViewById(R.id.person1_location);

        ImageView img2 = (ImageView)root.findViewById(R.id.person2_img);
        TextView name2 = (TextView)root.findViewById(R.id.person2_name);
        TextView age2 = (TextView) root.findViewById(R.id.person2_age);
        TextView location2= (TextView)root.findViewById(R.id.person2_location);


        img1.setImageResource(person1.getImg_src());
        name1.setText(person1.getName());
        age1.setText(Integer.toString(person1.getAge()));
        location1.setText(person1.getLocation());


        img2.setImageResource(person2.getImg_src());
        name2.setText(person2.getName());
        age2.setText(Integer.toString(person2.getAge()));
        location2.setText(person2.getLocation());

        return root;
    }


}
