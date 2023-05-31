package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga10);

        Button btnnxtY10, btnprevY10;

        btnnxtY10=findViewById(R.id.btnNxtY10);
        btnprevY10=findViewById(R.id.btnPrevY10);


        btnnxtY10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yok;
                yok=new Intent(yoga10.this, yoga11.class);
                startActivity(yok);
            }
        });

        btnprevY10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yokk;
                yokk=new Intent(yoga10.this, yoga9.class);
                startActivity(yokk);
            }
        });

    }
}