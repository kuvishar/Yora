package com.example.atam.yora.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.atam.yora.infrastructure.YoraApplication;

public class BaseFragment extends Fragment {
    protected YoraApplication application;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (YoraApplication) getActivity().getApplication();
    }
}
