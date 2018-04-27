package com.example.kakaotalk2;

import android.os.Bundle;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        Button button = (Button)findViewById(R.id.button);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);

        viewPager.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        viewPager.setCurrentItem(0);

        button.setOnClickListener(movePageListener);
        button.setTag(0);
        button2.setOnClickListener(movePageListener);
        button2.setTag(1);
        button3.setOnClickListener(movePageListener);
        button3.setTag(2);
        button4.setOnClickListener(movePageListener);
        button4.setTag(3);
        button5.setOnClickListener(movePageListener);
        button5.setTag(4);

    }
    View.OnClickListener movePageListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            int tag = (int) v.getTag();
            viewPager.setCurrentItem(tag);
        }
    };
    private class pagerAdapter extends FragmentStatePagerAdapter
    {
        public pagerAdapter(android.support.v4.app.FragmentManager fm)
        {
            super(fm);
        }
        @Override
        public android.support.v4.app.Fragment getItem(int position)
        {
            switch(position)
            {
                case 0:
                    return new FragmentOne();
                case 1:
                    return new FragmentTwo();
                case 2:
                    return new FragmentThree();
                case 3:
                    return new FragmentFour();
                case 4:
                    return new FragmentFive();
                default:
                    return null;
            }
        }
        @Override
        public int getCount()
        {
            return 5;
        }
    }

}
