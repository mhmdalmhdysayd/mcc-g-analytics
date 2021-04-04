package com.example.exam.foodanddrink;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterRecycleView extends RecyclerView.Adapter<AdapterRecycleView.ViewHolder>{

    ArrayList<Component> components;

    public AdapterRecycleView(ArrayList<Component> components)
    {
        this.components = components;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View layoutInflater = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_recycle_view, parent, false);
       ViewHolder viewHolder = new ViewHolder(layoutInflater);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {
        holder.container.setBackgroundResource(components.get(position).getImage());
        holder.foodName.setText(components.get(position).getNameFood());
        holder.icon.setImageResource(components.get(position).getIcon());
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetialActivity.class);
                intent.putExtra("image", components.get(position).getImage() );
                intent.putExtra("foodName", components.get(position).getNameFood());
                intent.putExtra("foodComp", components.get(position).getFoodIngredients());
                intent.putExtra("foodWay",components.get(position).getWayPrepare());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return components.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout container;
        ImageView icon;
        TextView foodName;

        public ViewHolder(View itemView) {
            super(itemView);
            container = itemView.findViewById(R.id.container);
            icon = itemView.findViewById(R.id.iv_icon);
            foodName = itemView.findViewById(R.id.tv_name_food);
        }
    }
}
