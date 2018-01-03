package com.example.atam.yora.activites;

import android.os.Bundle;

import com.example.atam.yora.R;
import com.example.atam.yora.views.MainNavDrawer;

public class MainActivity extends BaseAuthenticatedActivity {
    @Override
    protected void onYoraCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(" Inbox");
        setNavDrawer(new MainNavDrawer(this));
    }
}
