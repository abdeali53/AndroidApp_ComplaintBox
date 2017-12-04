package com.example.abdeali.complaintbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppStartActivity extends Activity {

    Button btnLogin,btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_start);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}
