package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga7);

        Button btnnxtY7, btnprevY7;

        btnnxtY7=findViewById(R.id.btnnxtY7);
        btnprevY7=findViewById(R.id.btnprevY7);


        btnnxtY7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yoh;
                yoh=new Intent(yoga7.this, yoga8.class);
                startActivity(yoh);
            }
        });

        btnprevY7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yohh;
                yohh=new Intent(yoga7.this, yoga6.class);
                startActivity(yohh);
            }
        });

    }
}