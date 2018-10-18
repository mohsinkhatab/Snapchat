package com.example.mohsin.snapchat.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

import com.example.mohsin.snapchat.R;

/**
 * Created by mohsin on 10/17/2018.
 */

public class ChatFragment extends BaseFragment {
    public static ChatFragment create() {    return new ChatFragment();}



    @Override
    public int reslayout() {
        return R.layout.fragment_chat;
    }

    @Override
    public void inOnCreate(View root, @Nullable ViewGroup container, Bundle savedInstanceState) {

    }
}
