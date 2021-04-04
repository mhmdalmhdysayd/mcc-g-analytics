package com.example.exam.foodanddrink;

import android.app.FragmentTransaction;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private Menu mNavigationMenu;
    TextView tv_bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayShowTitleEnabled(false);

        tv_bar = findViewById(R.id.tv_bar);

        FragmentHome fragment = new FragmentHome();

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment, "MainFragment");
        transaction.commit();

        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }

        // Get the menu from navigation view
        mNavigationMenu =  navigationView.getMenu();
        // Get the share menu item from drawer navigation menu
        MenuItem itemHome = mNavigationMenu.findItem(R.id.nav_home);
        itemHome.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();

                // do something
                tv_bar.setText(getResources().getString(R.string.food_drink));
                FragmentHome fragment = new FragmentHome();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment, "MainFragment");
                transaction.commit();

                return false;
            }
        });

        MenuItem itemRestaurant = mNavigationMenu.findItem(R.id.nav_restaurant);
        itemRestaurant.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();
                // do something
                tv_bar.setText("الوجبات");
                FragmentFood fragment = new FragmentFood();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment, "foodFragment");
                transaction.commit();
                return false;
            }
        });
        MenuItem itemCake = mNavigationMenu.findItem(R.id.nav_cake);
        itemCake.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();
                // do something
                tv_bar.setText("الحلويات");
                FragmentFood fragment = new FragmentFood();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment, "cakeFragment");
                transaction.commit();
                return false;
            }
        });
        MenuItem itemJuice = mNavigationMenu.findItem(R.id.nav_juice);
        itemJuice.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();
                // do something
                tv_bar.setText("المشروبات الباردة");
                FragmentFood fragment = new FragmentFood();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment, "juiceFragment");
                transaction.commit();
                return false;
            }
        });
        MenuItem itemChocolate = mNavigationMenu.findItem(R.id.nav_chocolate);
        itemChocolate.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();
                // do something
                tv_bar.setText("المشروبات الساخنة");
                FragmentFood fragment = new FragmentFood();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container, fragment, "ChocolateFragment");
                transaction.commit();
                return false;
            }
        });

    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        mDrawerLayout.closeDrawers();
                        return true;
                    }
                });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;



        }
        return super.onOptionsItemSelected(item);

    }

}
