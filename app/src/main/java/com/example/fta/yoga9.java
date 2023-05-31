package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga9);

        Button btnnxtY9, btnprevY9;

        btnnxtY9=findViewById(R.id.btnnxtY9);
        btnprevY9=findViewById(R.id.btnprevY9);


        btnnxtY9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yoj;
                yoj=new Intent(yoga9.this, yoga10.class);
                startActivity(yoj);
            }
        });

        btnprevY9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yojj;
                yojj=new Intent(yoga9.this, yoga8.class);
                startActivity(yojj);
            }
        });

    }
}