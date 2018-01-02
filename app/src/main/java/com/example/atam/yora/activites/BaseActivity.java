package com.example.atam.yora.activites;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.atam.yora.infrastructure.YoraApplication;

public abstract class BaseActivity extends AppCompatActivity {
    protected YoraApplication application;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (YoraApplication) getApplication();
    }
}
