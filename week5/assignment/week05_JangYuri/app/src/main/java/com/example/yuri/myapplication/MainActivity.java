package com.example.yuri.myapplication;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {//implements ViewPager.OnPageChangeListener

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("아만다");

        setupNavigationView();
    }


    private void setupNavigationView() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
//        BottomNavigationMenuView menuView = (BottomNavigationMenuView) bottomNavigationView.getChildAt(0);
//        for (int i = 0; i < menuView.getChildCount(); i++) {
//            final View iconView = menuView.getChildAt(i).findViewById(android.support.design.R.id.icon);
//            final ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
//            final DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
//            // set your height here
//            layoutParams.height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 32, displayMetrics);
//            // set your width here
//            layoutParams.width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 60, displayMetrics);
//            iconView.setLayoutParams(layoutParams);
//        }
        if (bottomNavigationView != null) {

            // Select first menu item by default and show Fragment accordingly.
            Menu menu = bottomNavigationView.getMenu();
            selectFragment(menu.getItem(0));

            // Set action to perform when any menu-item is selected.
            bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        selectFragment(item);
                        return false;
                    }
                });
        }
    }

    /**
     * Perform action when any item is selected.
     */
    protected void selectFragment(MenuItem item) {

        item.setChecked(true);

        switch (item.getItemId()) {
            case R.id.nav_today:
                pushFragment(new Page1_Today());
                break;
            case R.id.nav_cardlist:
                pushFragment(new Page2_CardList());
                break;
            case R.id.nav_message:
                pushFragment(new Page3_Message());
                break;
            case R.id.nav_profile:
                pushFragment(new Page4_Profile());
                break;
        }
    }

    /**
     * Method to push any fragment into given id.
     */
    protected void pushFragment(Fragment fragment) {
        if (fragment == null)
            return;

        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction ft = fragmentManager.beginTransaction();
            if (ft != null) {
                ft.replace(R.id.container, fragment);
                ft.commit();
            }
        }
    }

}
