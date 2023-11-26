package com.example.tabfragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewpageMessengeAdaptor  extends FragmentPagerAdapter {
    public ViewpageMessengeAdaptor(@NonNull FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        if(position ==1)
            return new ChatFragment();
        else if(position == 2)
            return new StatusFragment();
        else
            return  new CallFragment();
    }

    @Override
    public int getCount() {
        return 3;  // no of tabs count who many tabs you created for this projects
    }

//    this function is used for the show the names of the tabs into screen
    @Override
    public CharSequence getPageTitle(int position) {
        if(position ==1)
            return "Chat";
        else if(position == 2)
            return "Status";
        else
            return  "Call";
    }
}
