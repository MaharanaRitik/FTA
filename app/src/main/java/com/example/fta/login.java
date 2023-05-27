package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnSignupNew, btnLogin;
        EditText loginUsername, loginPass;
        TextView newUserTxt;

        btnSignupNew = findViewById(R.id.btnSignupNew);
        btnLogin = findViewById(R.id.btnLogin);
        loginUsername = findViewById(R.id.loginUsername);
        loginPass = findViewById(R.id.loginPass);
        newUserTxt = findViewById(R.id.newUserTxt);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent welcome;
                welcome = new Intent(login.this, homeScreenF.class);
                startActivity(welcome);
            }
        });

        btnSignupNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signNew;
                signNew = new Intent(login.this, signup.class);
                        startActivity(signNew);
            }


        });







    }
}