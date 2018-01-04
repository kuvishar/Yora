package com.example.atam.yora.views;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.atam.yora.R;
import com.example.atam.yora.activites.BaseActivity;
import com.example.atam.yora.activites.ContactsActivity;
import com.example.atam.yora.activites.MainActivity;
import com.example.atam.yora.activites.ProfileActivity;
import com.example.atam.yora.activites.SentMessagesActivity;
import com.example.atam.yora.infrastructure.User;

public class MainNavDrawer extends NavDrawer {
    private final TextView displayNameText;
    private final ImageView avatarImage;

    public MainNavDrawer(BaseActivity activity) {
        super(activity);

        addItem(new ActivityNavDrawerItem(MainActivity.class, "Inbox", null, R.drawable.ic_action_unread, R.id.include_main_nav_drawer_topItems));
        addItem(new ActivityNavDrawerItem(SentMessagesActivity.class, "Sent Messages", null, R.drawable.ic_action_send_now, R.id.include_main_nav_drawer_topItems));
        addItem(new ActivityNavDrawerItem(ContactsActivity.class, "Contacts", null, R.drawable.ic_action_group, R.id.include_main_nav_drawer_topItems));
        addItem(new ActivityNavDrawerItem(ProfileActivity.class, "Profile", null, R.drawable.ic_action_user_add, R.id.include_main_nav_drawer_topItems));
        addItem(new BasicNavDrawerItem("Logout", null, R.drawable.ic_action_backspace, R.id.include_main_nav_drawer_bottomItems) {
            @Override
            public void onClick(View view) {
                super.onClick(view);
                Toast.makeText(activity, "You Have Logged Out", Toast.LENGTH_SHORT).show();
            }
        });

        displayNameText = (TextView) navDrawerView.findViewById(R.id.include_main_nav_drawer_displayName);
        avatarImage = (ImageView) navDrawerView.findViewById(R.id.include_main_nav_drawer_avatar);

        User loggedInUser = activity.getYoraApplication().getAuth().getUser();
        displayNameText.setText(loggedInUser.getDisplayName());

        // todo: change avatarImage to avatarUrl from loggedInUser
    }
}
