package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class jumpingjack extends AppCompatActivity {

    private TextView JumpingJack;
    private EditText rep1;
    private Button nxtexe1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumpingjack);

        JumpingJack = findViewById(R.id.pose1);
        rep1 = findViewById(R.id.rep1);
        nxtexe1 = findViewById(R.id.nxtexe1);

        nxtexe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jmp;
                jmp = new Intent(jumpingjack.this, jumpingsquat.class);
                startActivity(jmp);
                finish();
            }
        });

    }
}