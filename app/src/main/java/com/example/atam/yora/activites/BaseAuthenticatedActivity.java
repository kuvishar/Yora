package com.example.atam.yora.activites;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

public abstract class BaseAuthenticatedActivity extends BaseActivity{
    @Override
    protected final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!application.getAuth().getUser().isLoggedIn()) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }

        onYoraCreate(savedInstanceState);
    }

    protected abstract void onYoraCreate(Bundle savedInstanceState);
}
