package com.bussiness.weplant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class Authentication_Activity extends AppCompatActivity {

    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        AuthSectionsPagerAdapter sectionsPagerAdapter = new AuthSectionsPagerAdapter(this, getSupportFragmentManager());
        int limit=(sectionsPagerAdapter.getCount()>1?sectionsPagerAdapter.getCount()-1:1);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setOffscreenPageLimit(limit);
        viewPager.setAdapter(sectionsPagerAdapter);
        tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        setUpTabIcons();

        new Login_Fragment().setRetainInstance(false);

    }

    private void setUpTabIcons()
    {
        Objects.requireNonNull(tabs.getTabAt(0)).setText("Login");
        Objects.requireNonNull(tabs.getTabAt(1)).setText("Signup");

    }
}