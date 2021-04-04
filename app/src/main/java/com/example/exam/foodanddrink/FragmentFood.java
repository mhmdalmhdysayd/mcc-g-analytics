package com.example.exam.foodanddrink;

import android.app.Fragment;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentFood  extends Fragment {
    private RecyclerView mRecyclerView;
    private AdapterRecycleView mAdapter;
    ArrayList<Component> food = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.food_fragment, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycle_view_food);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());


        mRecyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<Component> component = addFood.addAllFood();
        if (getTag().equals("foodFragment")) {
            food.clear();
            for (int i = 0; i < component.size(); ++i) {

                if (component.get(i).getTag() == 1)
                    food.add(component.get(i));
            }
        }
        if (getTag().equals("cakeFragment")) {
            food.clear();
            for (int i = 0; i < component.size(); ++i) {

                if (component.get(i).getTag() == 2)
                    food.add(component.get(i));
            }
        }
        if (getTag().equals("juiceFragment")) {
            food.clear();
            for (int i = 0; i < component.size(); ++i) {

                if (component.get(i).getTag() == 3)
                    food.add(component.get(i));
            }
        }
        if (getTag().equals("ChocolateFragment")) {
            food.clear();
            for (int i = 0; i < component.size(); ++i) {

                if (component.get(i).getTag() == 4)
                    food.add(component.get(i));
            }
        }


       mAdapter = new AdapterRecycleView(food);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
}