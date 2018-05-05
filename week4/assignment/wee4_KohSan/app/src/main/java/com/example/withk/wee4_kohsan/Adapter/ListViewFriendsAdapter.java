package com.example.withk.wee4_kohsan.Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.withk.wee4_kohsan.R;
import java.util.ArrayList;

public class ListViewFriendsAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<com.example.withk.wee4_kohsan.ListViewItemFriends> items;
    private int layout;

    public ListViewFriendsAdapter(Context context, int layout, ArrayList<com.example.withk.wee4_kohsan.ListViewItemFriends> data) {
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

        com.example.withk.wee4_kohsan.ListViewItemFriends listviewitemfriends = items.get(position);

        ImageView image = (ImageView) convertView.findViewById(R.id.profile_image);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView statusmessage = (TextView) convertView.findViewById(R.id.statusmessage);

        image.setImageResource(listviewitemfriends.getImage());
        name.setText(listviewitemfriends.getName());
        statusmessage.setText(listviewitemfriends.getStatusmessage());

        return convertView;
    }
}