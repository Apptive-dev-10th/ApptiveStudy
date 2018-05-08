package jeongmee.jeongmeetalk;

import android.support.v4.app.Fragment;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class FirstFragment extends android.support.v4.app.Fragment {

    public FirstFragment() {
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    ListView List_view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.first_fragment, container, false);

        List_view = layout.findViewById(R.id.List_view);
        dataSetting();
        return layout;

    }
    private void dataSetting()
    {
        Adapter adapter = new Adapter();

        adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.profile), "과제를" );
        adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.profile), "늦게낸" );
        adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.profile), "김정미" );
        adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.profile), "입니다" );
        adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.profile), "혼또니" );
        adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.profile), "고멘나" );
        adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.profile), "사이" );
        adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.profile), "간바레" );
        adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.profile), "팀장님!" );
        adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.profile), "앱티브" );
        adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.profile), "화이팅!" );
        adapter.addItem(ContextCompat.getDrawable(this.getContext(), R.drawable.profile), "눈물눈물" );
        List_view.setAdapter(adapter);
    }
}
