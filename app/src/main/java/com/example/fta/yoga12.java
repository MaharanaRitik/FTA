package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class yoga12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga12);

        Button btnFnsY12, btnprevY12;

        btnFnsY12=findViewById(R.id.btnFnsY12);
        btnprevY12=findViewById(R.id.btnprevY12);


        btnFnsY12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yom;
                yom=new Intent(yoga12.this, homeScreen.class);
                Toast.makeText(yoga12.this, "Great job, you're done for the day!", Toast.LENGTH_SHORT).show();
                startActivity(yom);
            }
        });

        btnprevY12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yomm;
                yomm=new Intent(yoga12.this, yoga11.class);
                startActivity(yomm);
                finish();

            }
        });

    }
}