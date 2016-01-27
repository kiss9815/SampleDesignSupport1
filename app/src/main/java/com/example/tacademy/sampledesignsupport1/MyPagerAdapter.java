package com.example.tacademy.sampledesignsupport1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Tacademy on 2016-01-27.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TabFragment.newInstance("item : " + position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "tab" +position;
    }

    @Override
    public int getCount() {
        return 10;
    }
}
