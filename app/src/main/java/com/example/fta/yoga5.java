package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga5);

        Button btnnxtY5, btnprevY5;

        btnnxtY5=findViewById(R.id.btnnxtY5);
        btnprevY5=findViewById(R.id.btnprevY5);


        btnnxtY5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yoe;
                yoe=new Intent(yoga5.this, yoga6.class);
                startActivity(yoe);
            }
        });

        btnprevY5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yoee;
                yoee=new Intent(yoga5.this, yoga4.class);
                startActivity(yoee);
            }
        });

    }
}