package com.best.a101j;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    ViewPagerA viewPagerA;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager_id);
        viewPagerA = new ViewPagerA(getSupportFragmentManager());
        viewPagerA.lists(new Page_1());
        viewPagerA.lists(new Page_2());
        viewPagerA.lists(new Page_3());
        viewPager.setAdapter(viewPagerA);

    }

}