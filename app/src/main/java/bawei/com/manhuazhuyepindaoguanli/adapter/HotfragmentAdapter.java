package bawei.com.manhuazhuyepindaoguanli.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import bawei.com.manhuazhuyepindaoguanli.bean.WeekInfoBean;
import bawei.com.manhuazhuyepindaoguanli.fragment.WeekFragment;
import bawei.com.manhuazhuyepindaoguanli.utils.DateUtil;

/**
 * Created by Huangminghuan on 2017/6/2.
 */

public class HotfragmentAdapter extends FragmentPagerAdapter {

    Context context;
    List<WeekInfoBean> list;
    String[] TITLE= DateUtil.initWeek();

    public HotfragmentAdapter(FragmentManager fm, List<WeekInfoBean> list) {
        super(fm);
        this.list = list;
    }


    @Override
    public Fragment getItem(int position) {

        WeekFragment weekFragment = new WeekFragment();
        Bundle bundle = new Bundle();
        bundle.putString("week",String.valueOf(list.get(position).getDaytime()));
        weekFragment.setArguments(bundle);
        return weekFragment;
    }

    @Override
    public int getCount() {

        return TITLE.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLE[position];
    }
}
