package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class squatkicks extends AppCompatActivity {

    private TextView SquatKicks;
    private EditText rep9;
    private Button NextExe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squatkicks);

        SquatKicks = findViewById(R.id.pose9);
        rep9 = findViewById(R.id.rep9);
        NextExe = findViewById(R.id.nxtexe9);

        NextExe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent langur;
                langur = new Intent(squatkicks.this, sideplank.class);
                startActivity(langur);
                finish();
            }
        });

    }
}