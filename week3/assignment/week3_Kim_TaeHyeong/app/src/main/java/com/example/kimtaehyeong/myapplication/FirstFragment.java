package com.example.kimtaehyeong.myapplication;

import android.app.Fragment;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class FirstFragment extends android.support.v4.app.Fragment
{
    public FirstFragment()
    {

    }
    ListView List_view;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_first, container, false);

        List_view = layout.findViewById(R.id.List_view);
        dataSetting();
        return layout;

    }
        private void dataSetting()
        {
            Adapter adapter = new Adapter();


            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "보라돌이" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "뚜비" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "나나" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "뽀" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "홍길동" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "홍길동 아버지" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "홍길동 형" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "홍길동 형을" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "형이라 부르지 못하고" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "홍길동 아버지를" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "아버지라 부르지 못하는" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "홍길동 동생" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "홍길동 친구1" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "홍길동 친구2" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "홍길동 친구3" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "홍길동 친구4" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "홍길동 친구5" );
            adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon_profile_big), "홍길동 친구6" );


            List_view.setAdapter(adapter);
        }

}