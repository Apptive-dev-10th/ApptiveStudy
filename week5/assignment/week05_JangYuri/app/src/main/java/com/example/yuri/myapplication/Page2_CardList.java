package com.example.yuri.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuri on 2018. 5. 12..
 */

public class Page2_CardList extends Fragment {
    RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page2, container, false);

        mRecyclerView = view.findViewById(R.id.cardSection1);

        //열 넣기
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(view.getContext(), 3);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        List cardList = new ArrayList<>();
        for(int i=0; i<6; i++) {
            cardList.add(new CardData(R.drawable.image1, "비주"));
        }

        MyAdpater myAdapter = new MyAdpater(view.getContext(), cardList);
        mRecyclerView.setAdapter(myAdapter);

        mRecyclerView = view.findViewById(R.id.cardSection2);

        //열 넣기
        GridLayoutManager mGridLayoutManager2 = new GridLayoutManager(view.getContext(), 3);
        mRecyclerView.setLayoutManager(mGridLayoutManager2);

        List cardList2 = new ArrayList<>();
        for(int i=0; i<6; i++) {
            cardList2.add(new CardData(R.drawable.image2, "아만다"));
        }

        MyAdpater myAdapter2 = new MyAdpater(view.getContext(), cardList2);
        mRecyclerView.setAdapter(myAdapter2);

        return view;
    }
}
