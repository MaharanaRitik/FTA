package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga1);

        Button btnnxtY1;
        btnnxtY1=findViewById(R.id.btnNxtY1);
        btnnxtY1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yoa;
                yoa=new Intent(yoga1.this, yoga2.class);
                startActivity(yoa);
            }
        });
    }
}