package com.example.kakaotalk3;

import android.content.Context;
import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;
import com.github.clans.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionMenu fam;
    FrameLayout frameLayout;
    FloatingActionButton fab_qr, fab_address, fab_id, fab_recommend;
    ViewPager viewPager;
    EditText editText;
    ImageButton imageButton,imageButton2, imageButton3,imageButton4,imageButton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frameLayout);

        fab_qr = (FloatingActionButton)findViewById(R.id.fab_qr);
        fab_address = (FloatingActionButton) findViewById(R.id.fab_address);
        fab_id = (FloatingActionButton)findViewById(R.id.fab_id);
        fab_recommend = (FloatingActionButton)findViewById(R.id.fab_recommend);
        fam = (FloatingActionMenu)findViewById(R.id.fam);

        fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fam.isOpened()){
                    fam.close(true);
                }
            }
        });

        fab_qr.setOnClickListener(onFabClick());
        fab_address.setOnClickListener(onFabClick());
        fab_id.setOnClickListener(onFabClick());
        fab_recommend.setOnClickListener(onFabClick());

//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Toast.makeText(getApplicationContext(),"기능 미구현",Toast.LENGTH_SHORT).show();
//                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        frameLayout.bringChildToFront(fam);

        editText = (EditText)findViewById(R.id.editText);

        viewPager = (ViewPager)findViewById(R.id.viewPager);

        imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton)findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton)findViewById(R.id.imageButton5);
        imageButton.setImageResource(R.drawable.human);
        imageButton2.setImageResource(R.drawable.textbullon);
        imageButton3.setImageResource(R.drawable.news);
        imageButton5.setImageResource(R.drawable.etc);

//        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
//        viewPager.setCurrentItem(0);
        viewPager.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        viewPager.setCurrentItem(0);

        imageButton.setOnClickListener(movePageListener);
        imageButton.setTag(0);
        imageButton2.setOnClickListener(movePageListener);
        imageButton2.setTag(1);
        imageButton3.setOnClickListener(movePageListener);
        imageButton3.setTag(2);
        imageButton4.setOnClickListener(movePageListener);
        imageButton4.setTag(3);
        imageButton5.setOnClickListener(movePageListener);
        imageButton5.setTag(4);
    }
    View.OnClickListener movePageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int tag = (int)v.getTag();
            viewPager.setCurrentItem(tag);
        }
    };
    private class pagerAdapter extends FragmentStatePagerAdapter{
        public pagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position){
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
        public int getCount() {
            return 5;
        }
    }
    private View.OnClickListener onFabClick(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                    Toast.makeText(getApplicationContext(),"기능 미구현",Toast.LENGTH_SHORT).show();
                }

        };
    }

}
