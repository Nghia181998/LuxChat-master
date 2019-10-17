package com.example.luxchat.UI;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.luxchat.Adapter.TabLayoutAdaprer;
import com.example.luxchat.R;

public class HomeActivity extends AppCompatActivity {
    ActionBar actionBar;
    private int[] tabIcons = {
            R.drawable.icons8_facebook_messenger_48,
            R.drawable.icons8_user_group_48,
            R.drawable.icons8_about_48
    };
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#becff1")));
    }

    private void initView() {
        viewPager =findViewById(R.id.vp);
        viewPager.setAdapter(new TabLayoutAdaprer(getSupportFragmentManager()));
       TabLayout tabLayout = (TabLayout) findViewById(R.id.tl);
       tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }
}
