package com.example.kimtaehyeong.myapplication;

import android.app.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class FirstFragment extends android.support.v4.app.Fragment
{
    public FirstFragment()
    {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_first,container,false);

        String[] menuItems = {"리어카","카센터","터미널","널뛰기","기찻길","길동무","무리데스","스파게티","티라노","노루표페인트","트위터","터널","이제","그만","O","P","Q","R"};
        ListView ListView= (ListView) view.findViewById(R.id.List_view);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );

        ListView.setAdapter(listViewAdapter);

        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_first,container,false);
        return view;
        //return layout
    }
// 정상코드




}