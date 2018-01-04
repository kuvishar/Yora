package com.example.atam.yora.activites;

import android.os.Bundle;

import com.example.atam.yora.R;
import com.example.atam.yora.views.MainNavDrawer;

public class ProfileActivity extends BaseAuthenticatedActivity {
    @Override
    protected void onYoraCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_profile);
        setNavDrawer(new MainNavDrawer(this));
    }
}
