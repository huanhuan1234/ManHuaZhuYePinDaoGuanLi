package bawei.com.manhuazhuyepindaoguanli.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

import bawei.com.manhuazhuyepindaoguanli.task.IAsyncTak;
import bawei.com.manhuazhuyepindaoguanli.R;
import bawei.com.manhuazhuyepindaoguanli.ResponesListener;
import bawei.com.manhuazhuyepindaoguanli.bean.Weekbean;


/**
 * Created by Huangminghuan on 2017/6/2.
 */

public class WeekFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener,ResponesListener {
    String week;
    private View view;
    private SwipeRefreshLayout week_swiperefershlayout;
    private ListView week_listview;
    private List<Weekbean.DataBean.ComicsBean> list=new ArrayList<Weekbean.DataBean.ComicsBean>();
    private WeekFragmentAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.week_fragment, container, false);
        if (getArguments()!=null){
            week=getArguments().getString("week");
        }
        initView(view);

        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getData();
    }


    private void initView(View view) {

        week_swiperefershlayout = (SwipeRefreshLayout) view.findViewById(R.id.week_swiperefershlayout);
        week_listview = (ListView) view.findViewById(R.id.week_listview);
        week_swiperefershlayout.setOnRefreshListener(this);

        adapter = new WeekFragmentAdapter(this.getActivity(), list);
        week_listview.setAdapter(adapter);
    }


    //下拉刷新
    @Override
    public void onRefresh() {
        getData();

    }
    // 发送网络请求
    private void getData(){
        String path = "http://api.kuaikanmanhua.com/v1/daily/comic_lists/"+week+"?since=0&gender=0&sa_event=eyJwcm9qZWN0Ijoia3VhaWthbl9hcHAiLCJ0aW1lIjoxNDg5NjQzNTYxODM4LCJwcm9wZXJ0aWVzIjp7IkhvbWVwYWdlVGFiTmFtZSI6IueDremXqCIsIlZDb21tdW5pdHlUYWJOYW1lIjoi54Ot6ZeoIiwiJG9zX3ZlcnNpb24iOiI0LjQuMiIsIkdlbmRlclR5cGUiOiLlpbPniYgiLCJGcm9tSG9tZXBhZ2VUYWJOYW1lIjoi54Ot6ZeoIiwiJGxpYl92ZXJzaW9uIjoiMS42LjM0IiwiJG5ldHdvcmtfdHlwZSI6IldJRkkiLCIkd2lmaSI6dHJ1ZSwiJG1hbnVmYWN0dXJlciI6IkxFTk9WTyIsIkZyb21Ib21lcGFnZVVwZGF0ZURhdGUiOjMsIiRzY3JlZW5faGVpZ2h0IjoxNDQwLCJIb21lcGFnZVVwZGF0ZURhdGUiOjMsIlByb3BlcnR5RXZlbnQiOiJSZWFkSG9tZVBhZ2UiLCJGaW5kVGFiTmFtZSI6IuaOqOiNkCIsImFidGVzdF9ncm91cCI6MTAsIiRzY3JlZW5fd2lkdGgiOjkwMCwiJG9zIjoiQW5kcm9pZCIsIlRyaWdnZXJQYWdlIjoiSG9tZVBhZ2UiLCIkY2FycmllciI6IkNISU5BIE1PQklMRSIsIiRtb2RlbCI6Ikxlbm92byBQNzAtdCIsIiRhcHBfdmVyc2lvbiI6IjMuOS4yIn0sInR5cGUiOiJ0cmFjayIsImRpc3RpbmN0X2lkIjoiQTo1MDdCOUQyN0Q2NUEwMDAwIiwib3JpZ2luYWxfaWQiOiJBOjUwN0I5RDI3RDY1QTAwMDAiLCJldmVudCI6IlJlYWRIb21lUGFnZSJ9" ;

        new IAsyncTak(this).execute(path);
    }
    //成功就请求回调
    @Override
    public void sussess(String string) {

        System.out.println("---info----" + string);
        week_swiperefershlayout.setRefreshing(false);

        Weekbean weekbean = JSON.parseObject(string, Weekbean.class);


        list.addAll(weekbean.getData().getComics());

        adapter.notifyDataSetChanged();
    }

    @Override
    public void onFail() {
        week_swiperefershlayout.setRefreshing(false);
    }



}
