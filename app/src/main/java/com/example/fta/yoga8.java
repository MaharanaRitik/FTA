package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga8);

        Button btnnxtY8, btnprevY8;

        btnnxtY8=findViewById(R.id.btnnxtY8);
        btnprevY8=findViewById(R.id.btnprevY8);


        btnnxtY8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yoi;
                yoi=new Intent(yoga8.this, yoga9.class);
                startActivity(yoi);
            }
        });

        btnprevY8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yoii;
                yoii=new Intent(yoga8.this, yoga7.class);
                startActivity(yoii);
            }
        });

    }
}