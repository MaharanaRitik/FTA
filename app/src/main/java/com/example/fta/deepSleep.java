package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fta.R;

public class deepSleep extends AppCompatActivity {
    MediaPlayer deepMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deep_sleep);

        deepMusic = MediaPlayer.create(this, R.raw.sleep);


        // Find the buttons by their IDs
        Button btnPlay = findViewById(R.id.musicPlay3);
        Button btnPause = findViewById(R.id.musicPause3);
        Button btnStartOver = findViewById(R.id.musicRestart3);


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deepMusic.start();
            }
        });


        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deepMusic.pause(); // Pause the music
            }
        });

        btnStartOver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deepMusic.seekTo(0); // Start playing the music from the beginning
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (deepMusic != null) {
            deepMusic.release();
            deepMusic = null;
        }
    }
}