package com.example.atam.yora.activites;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.atam.yora.R;

public class RegisterActivity extends BaseActivity implements View.OnClickListener {
    private EditText userNameText;
    private EditText emailText;
    private EditText passwordText;
    private Button registerButton;
    private View progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userNameText = (EditText) findViewById(R.id.acitvity_register_userName);
        emailText = (EditText) findViewById(R.id.activity_register_email);
        passwordText = (EditText) findViewById(R.id.activity_register_password);
        registerButton = (Button) findViewById(R.id.activity_register_registerButton);
        progressBar = findViewById(R.id.activity_register_progreeBar);

        registerButton.setOnClickListener(this);
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View view) {
        if (view == registerButton) {
            application.getAuth().getUser().setLoggedIn(true);
            setResult(RESULT_OK);
            finish();
        }
    }
}
