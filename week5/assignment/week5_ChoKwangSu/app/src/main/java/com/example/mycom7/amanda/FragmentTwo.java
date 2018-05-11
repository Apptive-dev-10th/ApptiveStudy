package com.example.mycom7.amanda;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentTwo extends Fragment {
    ImageView imageView,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8;
    TextView textView,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
    public FragmentTwo(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2,container,false);

        imageView = view.findViewById(R.id.imageView);
        imageView2 = view.findViewById(R.id.imageView2);
        imageView3 = view.findViewById(R.id.imageView3);
        imageView4 = view.findViewById(R.id.imageView4);
        imageView5 = view.findViewById(R.id.imageView5);
        imageView6 = view.findViewById(R.id.imageView6);
        imageView7 = view.findViewById(R.id.imageView7);
        imageView8 = view.findViewById(R.id.imageView8);

        textView = view.findViewById(R.id.textView);
        textView2 = view.findViewById(R.id.textView2);
        textView3 = view.findViewById(R.id.textView3);
        textView4 = view.findViewById(R.id.textView4);
        textView5 = view.findViewById(R.id.textView5);
        textView6 = view.findViewById(R.id.textView6);
        textView7 = view.findViewById(R.id.textView7);
        textView8 = view.findViewById(R.id.textView8);

        imageView.setImageResource(R.drawable.emma);
        textView.setText("Emma Stone");
        imageView2.setImageResource(R.drawable.hanna);
        textView2.setText("Hannah Murray");
        imageView3.setImageResource(R.drawable.oh);
        textView3.setText("오수현");
        imageView4.setImageResource(R.drawable.bo);
        textView4.setText("박보영");
        imageView5.setImageResource(R.drawable.eom);
        textView5.setText("엄현경");
        imageView6.setImageResource(R.drawable.go);
        textView6.setText("고준희");
        imageView7.setImageResource(R.drawable.lee);
        textView7.setText("이민정");
        imageView8.setImageResource(R.drawable.park);
        textView8.setText("박신혜");

        textView.setTextColor(Color.parseColor("#000000"));
        textView2.setTextColor(Color.parseColor("#000000"));
        textView3.setTextColor(Color.parseColor("#000000"));
        textView4.setTextColor(Color.parseColor("#000000"));
        textView5.setTextColor(Color.parseColor("#000000"));
        textView6.setTextColor(Color.parseColor("#000000"));
        textView7.setTextColor(Color.parseColor("#000000"));
        textView8.setTextColor(Color.parseColor("#000000"));
        return view;



    }
}
