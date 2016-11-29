package com.planetastock.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.planetastock.remindme.R;
import com.planetastock.remindme.dto.RemindDTO;
import com.planetastock.remindme.dto.RemindListAdapter;

import java.util.ArrayList;
import java.util.List;


public class HistoryFragment extends AbstractFragment {

    private static final int LAYOUT = R.layout.fragment_history;


    public static HistoryFragment getInstance(Context context){
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setTitle(context.getString(R.string.tab_item_history));
        fragment.setContext(context);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView rc = (RecyclerView) view.findViewById(R.id.recyclerView);
        rc.setLayoutManager(new LinearLayoutManager(context));
        rc.setAdapter(new RemindListAdapter(createMockData()));
        return view;
    }

    private List<RemindDTO> createMockData() {

        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("Item 1"));
        data.add(new RemindDTO("Item 2"));
        data.add(new RemindDTO("Item 3"));
        data.add(new RemindDTO("Item 4"));
        data.add(new RemindDTO("Item 5"));
        data.add(new RemindDTO("Item 6"));
        return data;
    }
}
