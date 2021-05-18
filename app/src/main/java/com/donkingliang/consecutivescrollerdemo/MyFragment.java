package com.donkingliang.consecutivescrollerdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.donkingliang.consecutivescrollerdemo.adapter.RecyclerViewAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/**
 * @Author donkingliang
 * @Description
 * @Date 2020/4/18
 */
public class MyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_my,container,false);

        RecyclerView recyclerView1 = view.findViewById(R.id.recyclerView1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerViewAdapter adapter1 = new RecyclerViewAdapter(getActivity(),"RecyclerView1-");
        recyclerView1.setAdapter(adapter1);

        RecyclerView recyclerView2 = view.findViewById(R.id.recyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerViewAdapter adapter2 = new RecyclerViewAdapter(getActivity(),"RecyclerView2-");
        recyclerView2.setAdapter(adapter2);
        return view;

    }

    public void onLoadMore(final SmartRefreshLayout layout){
        // 模拟加载5秒钟
        layout.finishLoadMore(5000);
    }
}
