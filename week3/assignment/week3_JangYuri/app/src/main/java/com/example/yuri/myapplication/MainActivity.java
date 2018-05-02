package com.example.yuri.myapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fab;
    TabLayout tabs;
    ViewPager container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("KaKAKAKAoTalk");

        fab = findViewById(R.id.fab);
        tabs = findViewById(R.id.tabs);
        container = findViewById(R.id.container);

        pagerAdapter adapter = new pagerAdapter(getSupportFragmentManager());
//        adapter.addFragment(new FragmentTab1(), "1");
//        adapter.addFragment(new FragmentTab2(), "2");
//        adapter.addFragment(new FragmentTab3(), "3");
//        adapter.addFragment(new FragmentTab4(), "4");

        adapter.addFragment(new FragmentTab1(), R.drawable.icon_tab1_1);
        adapter.addFragment(new FragmentTab2(), R.drawable.icon_tab2_0);
        adapter.addFragment(new FragmentTab3(), R.drawable.icon_tab3_0);
        adapter.addFragment(new FragmentTab4(), R.drawable.icon_tab4_0);


        container.setAdapter(adapter);
        tabs.setupWithViewPager(container);
        tabs.setBackgroundColor(Color.parseColor("#FFE2E4E6"));

//        tabs.getTabAt(0).setIcon(R.drawable.icon_tab1_1);
//        tabs.getTabAt(1).setIcon(R.drawable.icon_tab2_0);
//        tabs.getTabAt(2).setIcon(R.drawable.icon_tab3_0);
//        tabs.getTabAt(3).setIcon(R.drawable.icon_tab4_0);

        for(int i=0; i<container.getAdapter().getCount(); i++){

            tabs.getTabAt(i).setCustomView(LayoutInflater.from(this).inflate(R.layout.tab_layout, null));
            View tabView = tabs.getTabAt(i).getCustomView();
            ImageView tabIcon = tabView.findViewById(R.id.icon);
            tabIcon.setImageResource(adapter.getTabInfo(i).getIconResId());
//            tabs.getTabAt(i).setIcon(adapter.getTabInfo(i).getIconResId());
        }

        /*
        TabLayout.Tab tab=tabLayout.getTabAt(position);
View view=tab.getCustomView();
TextView txtCount= (TextView) view.findViewById(R.id.txtCount);
txtCount.setText(count+"");
         */

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                ImageView tabIcon = tab.getCustomView().findViewById(R.id.icon);

                switch (tab.getPosition()){
                    case 0:
                        tabIcon.setImageResource(R.drawable.icon_tab1_1);
                        break;
                    case 1:
                        tabIcon.setImageResource(R.drawable.icon_tab2_1);
                        break;
                    case 2:
                        tabIcon.setImageResource(R.drawable.icon_tab3_1);
                        break;
                    case 3:
                        tabIcon.setImageResource(R.drawable.icon_tab4_1);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                ImageView tabIcon = tab.getCustomView().findViewById(R.id.icon);

//                switch (tab.getPosition()){
//                    case 0:
//                        tab.setIcon(R.drawable.icon_tab1_0);
//                        break;
//                    case 1:
//                        tab.setIcon(R.drawable.icon_tab2_0);
//                        break;
//                    case 2:
//                        tab.setIcon(R.drawable.icon_tab3_0);
//                        break;
//                    case 3:
//                        tab.setIcon(R.drawable.icon_tab4_0);
//                        break;
//                    default:
//                        break;
//                }
                switch (tab.getPosition()) {
                    case 0:
                        tabIcon.setImageResource(R.drawable.icon_tab1_0);
                        break;
                    case 1:
                        tabIcon.setImageResource(R.drawable.icon_tab2_0);
                        break;
                    case 2:
                        tabIcon.setImageResource(R.drawable.icon_tab3_0);
                        break;
                    case 3:
                        tabIcon.setImageResource(R.drawable.icon_tab4_0);
                        break;
                    default:
                        break;
                }

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        fab.setOnClickListener(this);
        fab.setBackgroundColor(Color.parseColor("#F4D84D" ));


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fab:
                Intent intent = new Intent(this, IntentActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
