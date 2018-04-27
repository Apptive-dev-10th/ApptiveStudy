package com.example.withk.week3_kohsan;

import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.example.withk.week3_kohsan.Adapter.ListViewAdapter;
import com.example.withk.week3_kohsan.Adapter.TabPagerAdapter;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabPagerAdapter tabpageradapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tablayout & viewpager 영역
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Tab One"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab Two"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab Three"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab Four"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager) findViewById(R.id.pager);

        // adapter 설정
        tabpageradapter = new TabPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(tabpageradapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
        // listview 영역
        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayList<ListViewItem> data = new ArrayList<>();

        ListViewItem item1 = new ListViewItem("고산", "like star");
        ListViewItem item2 = new ListViewItem("권현아", "회장님");
        ListViewItem item3 = new ListViewItem("김용희", "부회장님");

        for (int i = 0; i < 10 ; i++) {
            data.add(item1);
            data.add(item2);
            data.add(item3);
        }

        ListViewAdapter adapter = new ListViewAdapter(this, R.layout.list_view_item, data);
        listView.setAdapter(adapter);
    }
}