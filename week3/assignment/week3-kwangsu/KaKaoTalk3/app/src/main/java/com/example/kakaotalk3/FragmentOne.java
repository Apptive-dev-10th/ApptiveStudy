package com.example.kakaotalk3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;

public class FragmentOne extends Fragment {
    ImageView imageView;
//    ListView listView;
    NonScrollListView listView;
    ScrollView scrollView;
    public FragmentOne(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("ClickableViewAccessibility")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_1, container,false);

        scrollView = view.findViewById(R.id.scrollView);
        imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.person);
        listView = view.findViewById(R.id.listView);

        ListAdapter listAdapter = new ListAdapter();
        for(int i=0; i<10; i++) {
            listAdapter.addItem(R.drawable.search, "강동민");
            listAdapter.addItem(R.drawable.person, "강진주");
        }

        listView.setAdapter(listAdapter);
//        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(AbsListView absListView, int i) {
//                scrollView.requestDisallowInterceptTouchEvent(true);
//
//            }
//
//            @Override
//            public void onScroll(AbsListView absListView, int i, int i1, int i2) {
//                scrollView.requestDisallowInterceptTouchEvent(true);
//
//            }
//        });
//        listView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                int act = motionEvent.getAction();
//                switch (act & MotionEvent.ACTION_MASK) {
//                    case MotionEvent.ACTION_DOWN:      break;
//                    case MotionEvent.ACTION_MOVE:
//
//
//                        motionEvent.setAction(MotionEvent.ACTION_CANCEL);
//
//
//                        break;
//                    case MotionEvent.ACTION_UP:
//
//                        break;
//                    case MotionEvent.ACTION_POINTER_UP:
//
//                        break;
//                    case MotionEvent.ACTION_POINTER_DOWN:
//                        break;
//                    case MotionEvent.ACTION_CANCEL:
//                        break;
//                    default:
//                        break;
//                }
//                return false;
//            }
//
//        });
//        public boolean dispatchTouchEvent(MotionEvent ev){
//
//        }


        return view;
    }

}
