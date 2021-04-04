package com.example.exam.foodanddrink;

import android.app.Fragment;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;

public class FragmentHome extends Fragment {
    private RecyclerView mRecyclerView;
    private AdapterRecycleView mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycle_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (position%3 == 0) {
                    return 2;
                } else {
                    return 1;
                }
            }
        });

        mRecyclerView.setLayoutManager(gridLayoutManager);
        ArrayList<Component> component = addFood.addAllFood();
        Collections.shuffle(component);
        mAdapter = new AdapterRecycleView(component);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
}
