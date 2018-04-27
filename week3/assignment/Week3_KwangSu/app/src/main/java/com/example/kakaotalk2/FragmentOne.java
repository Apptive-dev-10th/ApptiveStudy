package com.example.kakaotalk2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by Win7 on 2018-04-27.
 */

public class FragmentOne extends Fragment
{
    public FragmentOne()
    {
    }
    ListView listView4;
    ImageView imageView2;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState)
    {
        View layout = inflater.inflate(R.layout.fragment_1, container, false);

        listView4 = layout.findViewById(R.id.listView4);
        imageView2 = layout.findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.icon);
        dataSetting();
        return layout;
    }
    private void dataSetting()
    {
        MyAdapter myAdapter = new MyAdapter();

        for (int i = 0; i < 10; i++)
        {
            myAdapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.icon), "name_" + i);
        }
        listView4.setAdapter(myAdapter);
    }
}
