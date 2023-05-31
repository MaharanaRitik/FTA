package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Diet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        Button btnGain,btnLoss,btnMaintain;
        btnGain=findViewById(R.id.btnGain);
        btnLoss=findViewById(R.id.btnLoss);
        btnMaintain=findViewById(R.id.btnMaintain);
        btnGain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gain;
                gain=new Intent(Diet.this, weightGain.class);
                startActivity(gain);
            }
        });

        btnLoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loss;
                loss = new Intent(Diet.this, weightLoss.class);
                startActivity(loss);
            }
        });

        btnMaintain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maintain;
                maintain = new Intent(Diet.this, weightMaintain.class);
                startActivity(maintain);
            }
        });
    }
}