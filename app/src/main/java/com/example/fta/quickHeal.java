package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fta.R;

public class quickHeal extends AppCompatActivity {

    MediaPlayer quickMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_heal);



        quickMusic = MediaPlayer.create(this, R.raw.minute20);


        // Find the buttons by their IDs
        Button btnPlay = findViewById(R.id.musicPlay1);
        Button btnPause = findViewById(R.id.musicPause1);
        Button btnStartOver = findViewById(R.id.musicRestart1);


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quickMusic.start();
            }
        });


        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quickMusic.pause(); // Pause the music
            }
        });

        btnStartOver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quickMusic.seekTo(0); // Start playing the music from the beginning
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (quickMusic != null) {
            quickMusic.release();
            quickMusic = null;
        }
    }

}