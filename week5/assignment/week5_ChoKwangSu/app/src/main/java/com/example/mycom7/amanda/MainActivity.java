package com.example.mycom7.amanda;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout one, two, three, four;
    ImageView image_1, image_2, image_3, image_4;
    TextView textView, textView2,textView3,textView4;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        textView.setText("오늘의 카드");
        textView2.setText("카드 리스트");
        textView3.setText("메시지");
        textView4.setText("프로필");

        image_1 = findViewById(R.id.image_1);
        image_2 = findViewById(R.id.image_2);
        image_3 = findViewById(R.id.image_3);
        image_4 = findViewById(R.id.image_4);

        image_1.setImageResource(R.drawable.twocard);
        image_2.setImageResource(R.drawable.fourcard);
        image_3.setImageResource(R.drawable.talk);
        image_4.setImageResource(R.drawable.profile);

        viewPager = findViewById(R.id.viewPager);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);

        one.setTag(0);
        two.setTag(1);
        three.setTag(2);
        four.setTag(3);

        viewPager.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        viewPager.setCurrentItem(0);

        one.setOnClickListener(pageMove);
        two.setOnClickListener(pageMove);
        three.setOnClickListener(pageMove);
        four.setOnClickListener(pageMove);



    }
    View.OnClickListener pageMove = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int tag = (int)view.getTag();
            viewPager.setCurrentItem(tag);

//            if(tag == 0){
//                one.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorPrimary));
//                two.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorAccent));
//                three.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorAccent));
//                four.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorAccent));
//            } else if(tag==1){
//                one.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorAccent));
//                two.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorPrimary));
//                three.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorAccent));
//                four.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorAccent));
//            } else if(tag==2){
//                one.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorAccent));
//                two.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorAccent));
//                three.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorPrimary));
//                four.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorAccent));
//            } else if(tag==3){
//                one.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorAccent));
//                two.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorAccent));
//                three.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorAccent));
//                four.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorPrimary));
//            }
        }
    };
    private class pagerAdapter extends FragmentStatePagerAdapter{
        public pagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position){

                case 0:
                    //one.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorPrimary));

                    return new FragmentOne();
                case 1:
                    //two.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorPrimary));

                    return new FragmentTwo();
                case 2:
                    //three.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorPrimary));
                    return new FragmentThree();

                case 3:
                    //four.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.colorPrimary));

                    return new FragmentFour();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    }
}
