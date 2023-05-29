package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Workout extends AppCompatActivity {

    ArrayList<exerciseModel> arrExercise = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        RecyclerView exRecyclerViewList = findViewById(R.id.exList);
        exRecyclerViewList.setLayoutManager(new LinearLayoutManager(this));

        arrExercise.add(new exerciseModel(R.raw.jumping_jacks, "Jumping_Jacks", "1 min", "hehe"));
        arrExercise.add(new exerciseModel(R.raw.jumping_squats, "Jumping_squats", "1 min", "hehe"));
        arrExercise.add(new exerciseModel(R.raw.lunge, "lunge 1", "3 min", "hehe"));
        arrExercise.add(new exerciseModel(R.raw.squat_kicks, "squat kicks", "1 min", "hehe"));
        arrExercise.add(new exerciseModel(R.raw.side_plank, "side plank", "1.5 min", "hehe"));
        arrExercise.add(new exerciseModel(R.raw.t_plank_exercise, "plank 2", "?", "hehe"));
        arrExercise.add(new exerciseModel(R.raw.push_ups, "push up 1", "1.5 min", "hehe"));

        recyclerWorkoutAdapter adapter = new recyclerWorkoutAdapter(this, arrExercise);
        exRecyclerViewList.setAdapter(adapter);

        Button startexr;
        startexr = findViewById(R.id.startexr);

        startexr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startexercise;
                startexercise=new Intent(Workout.this, jumpingjack.class);
                startActivity(startexercise);
            }
        });

    }
}