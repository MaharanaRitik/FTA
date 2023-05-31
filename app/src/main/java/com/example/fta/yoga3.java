package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga3);

        Button btnnxtY3, btnprevY3;

        btnnxtY3=findViewById(R.id.btnnxtY3);
        btnprevY3=findViewById(R.id.btnprevY3);


        btnnxtY3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yoc;
                yoc=new Intent(yoga3.this, yoga4.class);
                startActivity(yoc);
            }
        });

        btnprevY3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yocc;
                yocc=new Intent(yoga3.this, yoga2.class);
                startActivity(yocc);
            }
        });

    }
}