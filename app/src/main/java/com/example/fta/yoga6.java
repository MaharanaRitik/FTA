package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga6);

        Button btnnxtY6, btnprevY6;

        btnnxtY6=findViewById(R.id.btnnxtY6);
        btnprevY6=findViewById(R.id.btnprevY6);


        btnnxtY6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yof;
                yof=new Intent(yoga6.this, yoga7.class);
                startActivity(yof);
            }
        });

        btnprevY6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yoff;
                yoff=new Intent(yoga6.this, yoga5.class);
                startActivity(yoff);
            }
        });

    }
}