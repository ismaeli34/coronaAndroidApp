package com.example.coronaapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.graphics.Color;
import android.os.Bundle;

import com.example.coronaapp.PageTransform.ZoomOutPageTransformer;
import com.example.coronaapp.ui.main.Fragment_One;
import com.example.coronaapp.ui.main.Fragment_Three;
import com.example.coronaapp.ui.main.Fragment_Two;
import com.example.coronaapp.ui.main.PageAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

 Toolbar toolbar;
 ViewPager viewPager;
 TabLayout tabLayout;
 Toolbar toolbarTab;

    PageAdapter pageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tabLayout);
        toolbarTab = findViewById(R.id.toolbartab);
        setSupportActionBar(toolbar);
        pageAdapter = new PageAdapter(getSupportFragmentManager());
        pageAdapter.addFragment(new Fragment_One(),"One");
        pageAdapter.addFragment(new Fragment_Two(),"Two");
        pageAdapter.addFragment(new Fragment_Three(),"Three");
        viewPager.setAdapter(pageAdapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setPageTransformer(true, new ZoomOutPageTransformer());

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
//                        getWindow().setStatusBarColor(Color.RED);
//                        toolbar.setBackgroundColor(Color.RED);
//                        tabLayout.setBackgroundColor(Color.RED);
//                        toolbarTab.setBackgroundColor(Color.RED);
                        break;

                    case 1:
//                        getWindow().setStatusBarColor(Color.GREEN);
//                        toolbar.setBackgroundColor(Color.GREEN);
//                        tabLayout.setBackgroundColor(Color.GREEN);
//                        toolbarTab.setBackgroundColor(Color.GREEN);
                        break;
                    case 2:
//                        getWindow().setStatusBarColor(Color.BLUE);
//                        toolbar.setBackgroundColor(Color.BLUE);
//                        tabLayout.setBackgroundColor(Color.BLUE);
//                        toolbarTab.setBackgroundColor(Color.BLUE);
                        break;


                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}