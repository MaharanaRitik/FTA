package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeScreenM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_m);

        Button btnMeditateM, btnYogaM, btnFullWorkoutM, btnDietM;
        btnMeditateM=findViewById(R.id.btnMeditateM);
        btnFullWorkoutM=findViewById(R.id.btnFullWorkoutM);
        btnYogaM=findViewById(R.id.btnYogaM);
        btnDietM=findViewById(R.id.btnDietM);

        btnMeditateM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent meditate;
                meditate = new Intent(homeScreenM.this, Meditation.class);
                startActivity(meditate);
            }
        });
        btnDietM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diet;
                diet = new Intent(homeScreenM.this, Diet.class);
                startActivity(diet);
            }
        });

        btnYogaM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yoga;
                yoga = new Intent(homeScreenM.this, Yoga.class);
                startActivity(yoga);
            }
        });

        btnFullWorkoutM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent workout;
                workout=new Intent(homeScreenM.this, Workout.class);
                startActivity(workout);
            }
        });


    }
}