package com.example.leegyowon.week5_leegyowon;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("아만다");

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.container);

        pagerAdapter adapter = new pagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "오늘의 카드");
        adapter.addFragment(new Fragment2(), "카드 리스트");
        adapter.addFragment(new Fragment3(), "메시지");
        adapter.addFragment(new Fragment4(), "프로필");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));

        tabLayout.getTabAt(0).setIcon(R.drawable.icon1);
        tabLayout.getTabAt(1).setIcon(R.drawable.icon2);
        tabLayout.getTabAt(2).setIcon(R.drawable.icon3);
        tabLayout.getTabAt(3).setIcon(R.drawable.icon4);
    }

}