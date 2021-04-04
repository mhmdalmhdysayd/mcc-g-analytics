package com.example.exam.foodanddrink;

import android.content.Intent;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detial);



        Intent intent = getIntent();
        final int image = intent.getExtras().getInt("image");
        final int foodName = intent.getExtras().getInt("foodName");
        final int foodComp = intent.getExtras().getInt("foodComp");
        final int foodWay = intent.getExtras().getInt("foodWay");

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbar = findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(getString(foodName));

        ImageView imageView = findViewById(R.id.backdrop);
        TextView tv_comp = findViewById(R.id.tv_comp);
        TextView tv_way = findViewById(R.id.tv_way);

        imageView.setImageResource(image);
        tv_comp.setText(foodComp);
        tv_way.setText(foodWay);
    }
}
