package e.wodls.Week5_KimJaeIn;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import e.wodls.Week5_KimJaeIn.R;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.container);

        pagerAdapter adapter = new pagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentOne(), "오늘의 카드");
        adapter.addFragment(new FragmentTwo(), "카드 리스트");
        adapter.addFragment(new FragmentThree(), "메시지");
        adapter.addFragment(new FragmentFour(), "프로필");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}




