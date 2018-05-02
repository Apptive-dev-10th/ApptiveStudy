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

public class FragmentTab1 extends Fragment {


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);


        //내 프로필
        ListView listView = view.findViewById(R.id.list_friends_me);

        View header = getLayoutInflater().inflate(R.layout.list_header, null, false) ;
        TextView headerText = header.findViewById(R.id.header_title);
        headerText.setText("내 프로필");

        listView.addHeaderView(header);

        ArrayList<ListViewItem> friendsList = new ArrayList<>();

        friendsList.add(new ListViewItem(R.drawable.basic_pic, "장유리", "hehe"));


        ListViewAdapter adapter = new ListViewAdapter(getContext(), R.layout.friends_list_item_layout, friendsList);
        listView.setAdapter(adapter);


        //추천친구
        ListView listView2 = view.findViewById(R.id.list_friends_recom);

        View header2 = getLayoutInflater().inflate(R.layout.list_header, null, false) ;
        TextView headerText2 = header2.findViewById(R.id.header_title);
        headerText2.setText("추천친구");

        listView2.addHeaderView(header2);

        ArrayList<ListViewItem> friendsList2 = new ArrayList<>();
        friendsList2.add(new ListViewItem(R.drawable.ryan, "라이언",null));

        ListViewAdapter adapter2 = new ListViewAdapter(getContext(), R.layout.friends_list_item_layout, friendsList2);
        listView2.setAdapter(adapter2);


        //그룹
        ListView listView4 = view.findViewById(R.id.list_friends_group);

        View header4 = getLayoutInflater().inflate(R.layout.list_header, null, false) ;
        TextView headerText4 = header4.findViewById(R.id.header_title);
        headerText4.setText("그룹");

        listView4.addHeaderView(header4);

        ArrayList<ListViewItem> friendsList4 = new ArrayList<>();

        friendsList4.add(new ListViewItem(R.drawable.plus_friends, "플러스친구",null));

        listView4.setAdapter(new ListViewAdapter(getContext(), R.layout.friends_list_item_layout, friendsList4));



        //친구
        ListView listView5 = view.findViewById(R.id.list_friends_all);

        View header5 = getLayoutInflater().inflate(R.layout.list_header, null, false) ;
        TextView headerText5 = header5.findViewById(R.id.header_title);
        headerText5.setText("친구");

        listView5.addHeaderView(header5);

        ArrayList<ListViewItem> friendsList5 = new ArrayList<>();

        for(int i=0; i<50; i++) {
            friendsList2.add(new ListViewItem(R.drawable.basic_pic, "야야야야","호롤로롤"));
        }

        listView5.setAdapter(new ListViewAdapter(getContext(), R.layout.friends_list_item_layout, friendsList5));


        return view;
    }
}
