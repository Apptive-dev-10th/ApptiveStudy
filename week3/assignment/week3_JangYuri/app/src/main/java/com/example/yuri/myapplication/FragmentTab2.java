package com.example.yuri.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by yuri on 2018. 4. 28..
 */

public class FragmentTab2 extends Fragment {
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);

        ListView listView = view.findViewById(R.id.list_chattingRoom);


        ArrayList<ListViewItem> friendsList = new ArrayList<>();

        for(int i=0; i<20; i++) {
            friendsList.add(new ListViewItem(R.drawable.basic_pic, "구사몬들..", "피크닉가쟝!~!", "3:38"));
        }


        ListViewAdapter2 adapter = new ListViewAdapter2(getContext(), R.layout.chatting_list_item_layout, friendsList);
        listView.setAdapter(adapter);

        return view;
    }
}
