package com.example.fta;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button btnMeditateF, btnYogaF, btnFullWorkoutF, btnDietF;
        btnMeditateF=findViewById(R.id.btnMeditateF);
        btnFullWorkoutF=findViewById(R.id.btnFullWorkoutF);
        btnYogaF=findViewById(R.id.btnYogaF);
        btnDietF=findViewById(R.id.btnDietF);

        btnMeditateF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent meditate;
                meditate = new Intent(homeScreen.this, Meditation.class);
                startActivity(meditate);
            }
        });
        btnDietF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diet;
                diet = new Intent(homeScreen.this, Diet.class);
                startActivity(diet);
            }
        });

        btnYogaF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yoga;
                yoga = new Intent(homeScreen.this, Yoga.class);
                startActivity(yoga);
            }
        });

        btnFullWorkoutF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent workout;
                workout=new Intent(homeScreen.this, Workout.class);
                startActivity(workout);
            }
        });

    }
}