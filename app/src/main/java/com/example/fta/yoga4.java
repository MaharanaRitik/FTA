package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga4);


        Button btnnxtY4, btnprevY4;

        btnnxtY4=findViewById(R.id.btnnxtY4);
        btnprevY4=findViewById(R.id.btnprevY4);


        btnnxtY4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yod;
                yod=new Intent(yoga4.this, yoga5.class);
                startActivity(yod);
            }
        });

        btnprevY4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yodd;
                yodd=new Intent(yoga4.this, yoga3.class);
                startActivity(yodd);
            }
        });

    }
}