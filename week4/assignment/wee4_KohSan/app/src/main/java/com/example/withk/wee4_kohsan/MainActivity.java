package com.example.withk.wee4_kohsan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
//import com.example.withk.wee4_kohsan.Adapter.ListViewChattingAdapter;
import com.example.withk.wee4_kohsan.Adapter.ListViewFriendsAdapter;
import com.example.withk.wee4_kohsan.PagerAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private FloatingActionButton fab;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.container);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);

        tabLayout.setupWithViewPager(viewPager);
        adapter.addFragment(new Fragment1(), "11111");
        adapter.addFragment(new Fragment2(), "22222");
        adapter.addFragment(new Fragment3(), "33333");
        adapter.addFragment(new Fragment4(), "44444");

        fab.setOnClickListener(this);



        // 1번 Fragment에 들어가는 친구목록 Listview
        ListView listView = (ListView) findViewById(R.id.list_view_friends);
        ArrayList<ListViewItemFriends> data = new ArrayList<>();

        ListViewItemFriends item1 = new ListViewItemFriends(R.drawable.avatar,"고산", "like star");
        ListViewItemFriends item2 = new ListViewItemFriends(R.drawable.avatar,"고산", "like star");

        for (int i = 0; i < 10 ; i++) {
        data.add(item1);
        data.add(item2);
        }

        ListViewFriendsAdapter adapter1 = new ListViewFriendsAdapter(this, R.layout.list_view_item_friends, data);
        listView.setAdapter(adapter1);


        // 2번 Fragment에 들어가는 채팅목록 Listview
        //ListView2 listView = (ListView2) findViewById(R.id.list_view_chatting);
        //ArrayList<ListViewItemChatting> data = new ArrayList<>();

        //ListViewItemChatting item10 = new ListViewItemChatting(R.drawable.avatar,"장호연", "굿나잇");
        //ListViewItemChatting item20 = new ListViewItemChatting(R.drawable.avatar,"조성윤", "과제늦게내서 죄송합니다.");
        //ListViewItemChatting item30 = new ListViewItemChatting(R.drawable.avatar,"권혀나", "족발 개맛있네");
        //for (int i = 0; i < 10 ; i++) {
        //    data.add(item10);
        //    data.add(item20);
        //    data.add(item30);
        //}

        //ListViewChattingAdapter adapter2 = new ListViewChattingAdapter(this, R.layout.list_view_item_chatting, data);
        //listView.setAdapter(adapter2);
}


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fab:

                Intent intent = new Intent(this, IntentActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}