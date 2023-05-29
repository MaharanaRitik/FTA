package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Meditation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);

        Button btnChakra, btnQuick, btnDeepSleep;
        btnQuick=findViewById(R.id.btnQuick);
        btnChakra=findViewById(R.id.btnChakra);
        btnDeepSleep=findViewById(R.id.btnDeepSleep);

        btnQuick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quick;
                quick = new Intent(Meditation.this, quickHeal.class);
                startActivity(quick);
            }
        });

        btnChakra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lev;
                lev = new Intent(Meditation.this, chakra.class);
                startActivity(lev);
            }
        });

        btnDeepSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deep;
                deep = new Intent(Meditation.this, deepSleep.class);
                startActivity(deep);
            }
        });

    }
}