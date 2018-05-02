package com.example.kimdonggeun.myapplication;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //floating button
        FloatingActionButton fab_main = (FloatingActionButton) findViewById(R.id.fab);
        final FloatingActionButton fab_btn1 = (FloatingActionButton) findViewById(R.id.fab_btn1);
        final FloatingActionButton fab_btn2 = (FloatingActionButton) findViewById(R.id.fab_btn2);

        fab_btn1.hide();
        fab_btn2.hide();

        fab_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fab_btn1.getVisibility()==View.GONE) {
                    fab_btn1.setVisibility(View.VISIBLE);
                    fab_btn2.setVisibility(View.VISIBLE);
                }
                else{
                    fab_btn1.setVisibility(View.GONE);
                    fab_btn2.setVisibility(View.GONE);
                }
            }
        });

    }
}
