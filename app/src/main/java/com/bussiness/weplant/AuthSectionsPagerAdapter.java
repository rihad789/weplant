package com.bussiness.weplant;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.android.material.tabs.TabLayout;

class AuthSectionsPagerAdapter extends FragmentPagerAdapter {

    private final Context mContext;
    private TabLayout tabs;

    public AuthSectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new Login_Fragment();
                break;
            case 1:
                fragment = new Signup_Fragment();

        }
        assert fragment != null;
        return fragment;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}
