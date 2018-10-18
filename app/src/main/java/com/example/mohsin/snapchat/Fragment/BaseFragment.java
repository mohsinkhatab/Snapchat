package com.example.mohsin.snapchat.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mohsin on 10/17/2018.
 */

public abstract class BaseFragment extends android.support.v4.app.Fragment {

    private View mRoot;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mRoot=inflater.inflate(reslayout(),container,false);
        inOnCreate(mRoot,container, savedInstanceState);
        return mRoot;


    }
@LayoutRes
    public abstract int reslayout();
    public abstract void inOnCreate(View root, @Nullable ViewGroup container, Bundle savedInstanceState);


}


