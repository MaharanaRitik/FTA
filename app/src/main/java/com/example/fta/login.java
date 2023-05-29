package com.example.fta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    private Button btnSignupNew, btnLogin;
    private EditText loginUsername, loginPass;
    private TextView newUserTxt;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnSignupNew = findViewById(R.id.btnSignupNew);
        btnLogin = findViewById(R.id.btnLogin);
        loginUsername = findViewById(R.id.loginUsername);
        loginPass = findViewById(R.id.loginPass);
        newUserTxt = findViewById(R.id.newUserTxt);
        auth = FirebaseAuth.getInstance();

        btnSignupNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signNew;
                signNew = new Intent(login.this, signup.class);
                startActivity(signNew);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email1 = loginUsername.getText().toString();
                String Password = loginPass.getText().toString();

                if(TextUtils.isEmpty(Email1) || TextUtils.isEmpty(Password))
                {
                    Toast.makeText(login.this, "Enter all Fields!! ", Toast.LENGTH_SHORT).show();
                }
                else{
                    Log(Email1,Password);
                }
            }
        });
    }
    private void Log(String Email, String Password) {
        auth.signInWithEmailAndPassword(Email, Password).addOnSuccessListener(login.this, new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Intent First;
                First = new Intent(login.this, homeScreenF.class);
                startActivity(First);
            }

        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(login.this, "Enter valid credentials! ", Toast.LENGTH_SHORT).show();
            }
        });
    }}