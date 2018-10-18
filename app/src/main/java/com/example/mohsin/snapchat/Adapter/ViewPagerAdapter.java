package com.example.mohsin.snapchat.Adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import com.example.mohsin.snapchat.Fragment.ChatFragment;
import com.example.mohsin.snapchat.Fragment.EmptyFragment;
import com.example.mohsin.snapchat.Fragment.StoryFragment;

/**
 * Created by mohsin on 10/17/2018.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position) {

            case 0:
                return ChatFragment.create();
            case 1:
                return EmptyFragment.create();
            case 2:
                return StoryFragment.create();
        };
        return null;
    }


    @Override
    public int getCount() {
        return 3;
    }
}
