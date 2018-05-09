package com.example.kimdonggeun.week5_apptive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 * Created by Kim Dong Geun on 2018-05-09.
 */

public class cardList_fragment extends Fragment {

    public cardList_fragment() {
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View root = inflater.inflate(R.layout.cardlist_main, container, false);

        Person_Adapter adapter = new Person_Adapter();

        GridView loveme = (GridView)root.findViewById(R.id.cardlist_loveme);
        loveme.setAdapter((ListAdapter)adapter);

        adapter.additem("김동근",R.drawable.girl,25,"부산");
        adapter.additem("김동순",R.drawable.girl2,25,"부산");
        adapter.additem("김동은",R.drawable.girl3,25,"부산");
        adapter.additem("김동근",R.drawable.girl,25,"부산");
        adapter.additem("김동순",R.drawable.girl2,25,"부산");
        adapter.additem("김동은",R.drawable.girl3,25,"부산");
        adapter.additem("김동근",R.drawable.girl,25,"부산");
        adapter.additem("김동순",R.drawable.girl2,25,"부산");
        adapter.additem("김동은",R.drawable.girl3,25,"부산");

        GridView loveyou = (GridView)root.findViewById(R.id.cardlist_loveyou);
        loveyou.setAdapter((ListAdapter)adapter);

        return root;
    }



}
