package com.example.yuri.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by yuri on 2018. 4. 28..
 */

public class ListViewAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private int layout;
    private ArrayList<ListViewItem> items;

    public ListViewAdapter(Context context, int layout, ArrayList<ListViewItem> data) {
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.layout = layout;
        this.items = data;

    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //number of data = 0
        if (convertView == null) {
            convertView = inflater.inflate(layout, parent, false);
        }

        ListViewItem listviewitem = items.get(position);

        ImageView image = (ImageView) convertView.findViewById(R.id.list_item_pPic);
        TextView name = (TextView) convertView.findViewById(R.id.list_item_name);
        TextView message = (TextView) convertView.findViewById(R.id.list_item_message);


//        image.setImageResource(listviewitem.getImage());


        Bitmap bitmap = BitmapFactory.decodeResource(convertView.getResources(), listviewitem.getImage());
        RoundedBitmapDrawable roundB = RoundedBitmapDrawableFactory.create(convertView.getResources(),bitmap);
        roundB.setCircular(true);
        image.setImageDrawable(roundB);




        name.setText(listviewitem.getName());
        message.setText(listviewitem.getMessage());

        return convertView;
    }
}
