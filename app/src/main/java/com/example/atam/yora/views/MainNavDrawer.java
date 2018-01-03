package com.example.atam.yora.views;


import android.view.View;
import android.widget.Toast;

import com.example.atam.yora.R;
import com.example.atam.yora.activites.BaseActivity;
import com.example.atam.yora.activites.MainActivity;

public class MainNavDrawer extends NavDrawer {
    public MainNavDrawer(BaseActivity activity) {
        super(activity);

        addItem(new ActivityNavDrawerItem(MainActivity.class, "Inbox", null , R.drawable.ic_action_unread, 0));

        addItem(new BasicNavDrawerItem("Logout", null, R.drawable.ic_action_backspace, 0){
            @Override
            public void onClick(View view) {
                super.onClick(view);
                Toast.makeText(activity, "You Have Logged Out", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
