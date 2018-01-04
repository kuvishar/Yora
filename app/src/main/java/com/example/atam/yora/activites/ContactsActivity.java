package com.example.atam.yora.activites;

import android.os.Bundle;

import com.example.atam.yora.R;
import com.example.atam.yora.views.MainNavDrawer;

public class ContactsActivity extends BaseAuthenticatedActivity {
    @Override
    protected void onYoraCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_contacts);
        setNavDrawer(new MainNavDrawer(this));
    }
}
