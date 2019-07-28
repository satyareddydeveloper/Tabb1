package com.example.tabb;

import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int tabposition) {
        switch (tabposition){
            case 0 :
                return new ProfileTab();

            case 1:
                return new SharePicture();
            case 2:
                return new UsersTab();
                default:
                    return null;

        }
    }

    @Override
    public int getCount() {

        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "ProfileTab";
            case 1:
                return "SharePicture";
            case 2:
                return "UsersTab";
                default:
                    return null;
        }
    }
}
