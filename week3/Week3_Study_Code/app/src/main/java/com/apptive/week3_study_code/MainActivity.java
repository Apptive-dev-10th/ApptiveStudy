1package com.apptive.week3_study_code;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Fragment Sample Code
         *
         *
         * add fragment using fragment transaction
         * */
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        FragmentOne fragmentOne = new FragmentOne();
//        FragmentTwo fragmentTwo = new FragmentTwo();
//
//        fragmentTransaction.replace(R.id.fragment1_replace, fragmentOne);
//        fragmentTransaction.replace(R.id.fragment2_replace, fragmentTwo);
//
//        fragmentTransaction.commit();
        /**
         * end of fragment transaction ( caution: must commit using transaction )
         * */



        /**
         * List View Sample Code
         * */
        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayList<ListViewItem> data = new ArrayList<>();

        ListViewItem item1 = new ListViewItem("조성윤", "개발팀장");
        ListViewItem item2 = new ListViewItem("권현아", "회장님");
        ListViewItem item3 = new ListViewItem("김용희", "부회장님");

        for (int i = 0; i < 10; i++) {
            data.add(item1);
            data.add(item2);
            data.add(item3);
        }

        ListViewAdapter adapter = new ListViewAdapter(this, R.layout.listview_item, data);
        listView.setAdapter(adapter);
        /**
         * End of List View Sample Code
         * */

    }
}
