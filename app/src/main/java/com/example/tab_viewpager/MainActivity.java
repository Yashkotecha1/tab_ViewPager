package com.example.tab_viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tab_id;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab_id = findViewById(R.id.tab_id);
        pager = findViewById(R.id.pager);

        tab_id.addTab(tab_id.newTab());
        tab_id.addTab(tab_id.newTab());

        tab_id.setTabGravity(TabLayout.GRAVITY_FILL);


        TabLayoutAdapter adapter = new TabLayoutAdapter(this, getSupportFragmentManager(), tab_id.getTabCount());
        pager.setAdapter(adapter);

       // pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab_id));

        tab_id.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //pager.setCurrentItem(tab.getPosition());

                Toast.makeText(MainActivity.this, "Selected Page "+tab.getText(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        tab_id.setupWithViewPager(pager);
    }

}