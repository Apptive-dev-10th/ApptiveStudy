package com.example.withk.week3_kohsan.Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.withk.week3_kohsan.ListViewItem;
import com.example.withk.week3_kohsan.R;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<ListViewItem> items;
    private int layout;

    public ListViewAdapter(Context context, int layout, ArrayList<ListViewItem> data) {
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.items = data;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return items.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater.inflate(layout, parent, false);
        }

        ListViewItem listviewitem = items.get(position);

        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView statusmessage = (TextView) convertView.findViewById(R.id.statusmessage);

        name.setText(listviewitem.getName());
        statusmessage.setText(listviewitem.getStatusmessage());

        return convertView;
    }
}