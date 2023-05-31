package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga2);

        Button btnnxtY2, btnprevY2;

        btnnxtY2=findViewById(R.id.btnnxtY2);
        btnprevY2=findViewById(R.id.btnprevY2);


        btnnxtY2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yob;
                yob=new Intent(yoga2.this, yoga3.class);
                startActivity(yob);
            }
        });

        btnprevY2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yobb;
                yobb=new Intent(yoga2.this, yoga1.class);
                startActivity(yobb);
            }
        });

    }
}