package com.example.mohsin.snapchat.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

import com.example.mohsin.snapchat.R;

/**
 * Created by mohsin on 10/17/2018.
 */

public class StoryFragment extends BaseFragment {
    public static StoryFragment create(){
        return new StoryFragment();
    }
    @Override
    public int reslayout() {
        return R.layout.fargment_story;
    }

    @Override
    public void inOnCreate(View root, @Nullable ViewGroup container, Bundle savedInstanceState) {

    }
}
