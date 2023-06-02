package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class plank2 extends AppCompatActivity {

    private TextView Plank2;
    private Button NextExe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plank2);

        Plank2 = findViewById(R.id.pose5);
        NextExe = findViewById(R.id.nxtexe5);

        NextExe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lnger;
                lnger = new Intent(plank2.this, pushup1.class);
                startActivity(lnger);
                finish();
            }
        });



    }
}