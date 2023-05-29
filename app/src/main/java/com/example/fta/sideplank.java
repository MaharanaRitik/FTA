package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sideplank extends AppCompatActivity {

    private TextView SidePlank;
    private EditText rep8;
    private Button NextExe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sideplank);

        SidePlank = findViewById(R.id.pose8);
        rep8 = findViewById(R.id.rep8);
        NextExe = findViewById(R.id.nxtexe8);

        NextExe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lnga;
                lnga = new Intent(sideplank.this, plank2.class);
                startActivity(lnga);
            }
        });

    }
}