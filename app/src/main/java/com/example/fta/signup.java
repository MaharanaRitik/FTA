package com.example.fta;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.SpringAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signup extends AppCompatActivity {
    private EditText crtWeight, crtAge, crtHeight, crtEmail, crtName, crtSex, txtpassword;
    private Button btnSignUp;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        crtWeight = findViewById(R.id.crtWeight);
        crtHeight = findViewById(R.id.crtHeight);
        crtEmail = findViewById(R.id.crtEmail);
        crtName = findViewById(R.id.crtName);
        crtAge = findViewById(R.id.crtAge);
        crtSex = findViewById(R.id.crtSex);
        txtpassword = findViewById(R.id.txtpassword);
        btnSignUp = findViewById(R.id.btnSignUp);
        auth = FirebaseAuth.getInstance();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Weight = crtWeight.getText().toString();
                String Height = crtHeight.getText().toString();
                String Email = crtEmail.getText().toString();
                String Name = crtName.getText().toString();
                String Age = crtAge.getText().toString();
                String Sex = crtSex.getText().toString();
                String Password = txtpassword.getText().toString();


                if(TextUtils.isEmpty(Email) || TextUtils.isEmpty(Weight) || TextUtils.isEmpty(Height) || TextUtils.isEmpty(Name) || TextUtils.isEmpty(Age) || TextUtils.isEmpty(Sex) || TextUtils.isEmpty(Password))
                {
                    Toast.makeText(signup.this, "Enter all Fields!! ", Toast.LENGTH_SHORT).show();
                }
                else{
                    Sign(Email, Password);
                }
                Intent backLogin;
                backLogin = new Intent(signup.this, login.class);
                startActivity(backLogin);
                finish();
            }
        });
    }

    private void Sign(String Email, String Password) {
        auth.createUserWithEmailAndPassword(Email, Password).addOnCompleteListener(signup.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(signup.this, "Successfully Register", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(signup.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}