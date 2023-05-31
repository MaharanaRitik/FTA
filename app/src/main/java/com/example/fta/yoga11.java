package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga11);

        Button btnnxtY11, btnprevY11;

        btnnxtY11=findViewById(R.id.btnnxtY11);
        btnprevY11=findViewById(R.id.btnprevY11);


        btnnxtY11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yol;
                yol=new Intent(yoga11.this, yoga12.class);
                startActivity(yol);
            }
        });

        btnprevY11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yoll;
                yoll=new Intent(yoga11.this, yoga10.class);
                startActivity(yoll);
            }
        });

    }
}