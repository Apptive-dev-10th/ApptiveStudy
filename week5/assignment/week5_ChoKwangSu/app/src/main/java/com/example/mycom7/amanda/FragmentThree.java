package com.example.mycom7.amanda;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FragmentThree extends Fragment {
    LinearLayout asd;
    ImageView image;
    public FragmentThree(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3,container,false);

        asd = view.findViewById(R.id.asd);

        asd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //asd.setBackgroundDrawable(getResources().getDrawable(R.drawable.fourcard));
                //image.setImageResource(R.drawable.park);
            }
        });

        return view;
    }
}
