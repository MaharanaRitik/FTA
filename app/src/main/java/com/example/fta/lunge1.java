package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lunge1 extends AppCompatActivity {

    private TextView Lunge1;
    private Button NextExe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunge1);

        Lunge1 = findViewById(R.id.pose3);
        NextExe = findViewById(R.id.nxtexe3);

        NextExe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lngu;
                lngu = new Intent(lunge1.this, squatkicks.class);
                startActivity(lngu);
                finish();
            }
        });
    }
}