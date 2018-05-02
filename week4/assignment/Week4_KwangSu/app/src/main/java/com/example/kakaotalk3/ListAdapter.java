package com.example.kakaotalk3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    private ArrayList<FriendList> items = new ArrayList<>();

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public FriendList getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();

        if (convertView ==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.friend_list, parent,false);
        }
        ImageView profile = (ImageView) convertView.findViewById(R.id.profile);
        TextView name = (TextView) convertView.findViewById(R.id.name);

        FriendList item = getItem(position);

        profile.setImageResource(item.getIcon());
        name.setText(item.getName());

        return convertView;
    }
    public void addItem(int img, String name){
        FriendList item = new FriendList();

        item.setIcon(img);
        item.setName(name);
        items.add(item);
    }
}
