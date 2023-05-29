package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fta.R;

public class chakra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chakra);


        MediaPlayer chakraMusic;
        chakraMusic = MediaPlayer.create(this, R.raw.chakra);




            // Find the buttons by their IDs
            Button btnPlay = findViewById(R.id.musicPlay2);
            Button btnPause = findViewById(R.id.musicPause2);
            Button btnStartOver = findViewById(R.id.musicRestart2);



           btnPlay.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   chakraMusic.start();
               }
           });


            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    chakraMusic.pause(); // Pause the music
                }
            });

            btnStartOver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    chakraMusic.seekTo(0); // Start playing the music from the beginning
                }
            });
        }


    }
