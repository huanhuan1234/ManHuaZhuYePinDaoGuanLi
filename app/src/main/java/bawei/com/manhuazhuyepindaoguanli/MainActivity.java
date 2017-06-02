package bawei.com.manhuazhuyepindaoguanli;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import bawei.com.manhuazhuyepindaoguanli.adapter.HotfragmentAdapter;
import bawei.com.manhuazhuyepindaoguanli.utils.DateUtil;

public class MainActivity extends FragmentActivity {

    private TabLayout tablayout;
    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setTablayout();
    }

    private void setTablayout() {

        HotfragmentAdapter adapter = new HotfragmentAdapter(getSupportFragmentManager(), DateUtil.getData());
        viewpager.setAdapter(adapter);

        tablayout.setupWithViewPager(viewpager);
        tablayout.setTabTextColors(getResources().getColor(R.color.cgray),getResources().getColor(R.color.coffer));
        tablayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.title_bg));
        tablayout.setTabMode(TabLayout.MODE_SCROLLABLE);

    }

    private void initView() {
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        viewpager = (ViewPager) findViewById(R.id.viewpager);

    }
}
