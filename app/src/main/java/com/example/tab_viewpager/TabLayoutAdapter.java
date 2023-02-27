package com.example.tab_viewpager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabLayoutAdapter extends FragmentPagerAdapter {
    Context mContext;
    int mTotalTabs;

    public TabLayoutAdapter(Context context, @NonNull FragmentManager fm, int totalTabs) {
        super(fm);
        mContext = context;
        mTotalTabs = totalTabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Home";
        }else{
            return "Login";
        }

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Tab1Fragment();
            case 1:
                return new Tab2Fragment();
            default:
                return new Tab1Fragment();
        }
    }

    @Override
    public int getCount() {
        return mTotalTabs;
    }
}
