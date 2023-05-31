package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class pushup1 extends AppCompatActivity {

    private TextView PushUp1;
    private EditText rep6;
    private Button NextExe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushup1);

        PushUp1 = findViewById(R.id.pose6);
        rep6 = findViewById(R.id.rep6);
        NextExe = findViewById(R.id.nxtexe6);

        NextExe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lngoo;
                lngoo = new Intent(pushup1.this, homeScreen.class);
                startActivity(lngoo);
                Toast.makeText(pushup1.this, "Great job, you're done for the day!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }
}