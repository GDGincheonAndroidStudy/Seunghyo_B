package com.seunghyo.sunshine_b;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by SeungHyo on 2015-08-11.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    private final String[] TITLES = {"Seoul", "Incheon", "Daegu", "New York" };

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public Fragment getItem(int position) {
        return SuperAwesomeCardFragment.newInstance(position);
    }

    public String returnString(int i) {
        return TITLES[i];
    }
}