package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class jumpingsquat extends AppCompatActivity {

    private TextView JumpingSquats;
    private Button NextExe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumpingsquat);

        JumpingSquats = findViewById(R.id.pose2);
        NextExe = findViewById(R.id.nxtexe2);

        NextExe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lng;
                lng = new Intent(jumpingsquat.this, lunge1.class);
                startActivity(lng);
                finish();
            }
        });
    }
}