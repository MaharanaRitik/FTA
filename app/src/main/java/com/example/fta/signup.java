package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        EditText crtWeight, crtAge, crtHeight, crtEmail, crtName, crtSex;
        Button btnLogin;

        crtWeight = findViewById(R.id.crtWeight);
        crtHeight = findViewById(R.id.crtHeight);
        crtEmail = findViewById(R.id.crtEmail);
        crtName = findViewById(R.id.crtName);
        crtAge = findViewById(R.id.crtAge);
        crtSex = findViewById(R.id.crtSex);
        btnLogin = findViewById(R.id.btnLogin);






    }
}