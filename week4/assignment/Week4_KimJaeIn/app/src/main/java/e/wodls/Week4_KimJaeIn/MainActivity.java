package e.wodls.Week4_KimJaeIn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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

        pagerAdapter adapter = new pagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentOne(), "11111");
        adapter.addFragment(new FragmentTwo(), "22222");
        adapter.addFragment(new FragmentThree(), "33333");
        adapter.addFragment(new FragmentFour(), "44444");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        fab.setOnClickListener(this);
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