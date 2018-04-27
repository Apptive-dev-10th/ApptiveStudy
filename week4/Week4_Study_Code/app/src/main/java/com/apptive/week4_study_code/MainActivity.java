package com.apptive.week4_study_code;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private FloatingActionButton fab;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * get layouts using their IDs. this is part of connection layout and java code
         * */
        fab = (FloatingActionButton) findViewById(R.id.fab);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.container);

        /**
         * insert items at adapter
         * */
        pagerAdapter adapter = new pagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentOne(), "11111");
        adapter.addFragment(new FragmentTwo(), "22222");
        adapter.addFragment(new FragmentThree(), "33333");
        adapter.addFragment(new FragmentFour(), "44444");

        /**
         * set adapter at ViewPager
         * */
        viewPager.setAdapter(adapter);

        /**
         * set ViewPager at TabLayout
         * */
        tabLayout.setupWithViewPager(viewPager);

        /**
         * setOnClickListener at fab
         * */
        fab.setOnClickListener(this);
    }

    /**
     * implementation of OnClickListener
     * this part is example using intent
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fab:
                /**
                 * create intent and start intent
                 * */
                Intent intent = new Intent(this, IntentActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
