package com.example.kimdonggeun.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kim Dong Geun on 2018-04-27.
 */

public class Profile_Adpater extends BaseAdapter {

    private ArrayList<Profile> items=new ArrayList<Profile>();

    public Profile_Adpater(){

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
            convertView=inflater.inflate(R.layout.profile,parent,false);
        }

        Profile profiles = items.get(position);


        ImageView profile_img = (ImageView) convertView.findViewById(R.id.Profile_img);
        TextView profile_name = (TextView)convertView.findViewById(R.id.Profile_name);

        profile_img.setImageResource(profiles.getImg_name());
        profile_name.setText(profiles.getPro_name());
                return convertView;
    }


    public void additem(String name,int img_name){
        Profile profile = new Profile();
        profile.setImg_name(img_name);
        profile.setPro_name(name);
        items.add(profile);

    }



}
