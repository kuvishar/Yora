package com.example.atam.yora.activites;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.atam.yora.R;
import com.example.atam.yora.infrastructure.YoraApplication;
import com.example.atam.yora.views.NavDrawer;

public abstract class BaseActivity extends AppCompatActivity {
    protected YoraApplication application;
    protected Toolbar toolbar;
    protected NavDrawer navDrawer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (YoraApplication) getApplication();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);

        toolbar = (Toolbar) findViewById(R.id.include_toolbar);

        if (toolbar != null)
            setSupportActionBar(toolbar);

    }

    public void setNavDrawer(NavDrawer navDrawer) {
        this.navDrawer = navDrawer;
        this.navDrawer.create();
    }

    public Toolbar getToolbar() {
        return toolbar;
    }
}
