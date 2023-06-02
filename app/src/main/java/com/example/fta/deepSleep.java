package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.example.fta.R;

public class deepSleep extends AppCompatActivity {
    MediaPlayer deepMusic;
    LottieAnimationView lottieSoundWaveSleep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deep_sleep);

        deepMusic = MediaPlayer.create(this, R.raw.sleep);
        lottieSoundWaveSleep=findViewById(R.id.lottieSoundWaveSleep);


        // Find the buttons by their IDs
        ImageButton btnPlay = findViewById(R.id.musicPlay3);
        ImageButton btnPause = findViewById(R.id.musicPause3);
        ImageButton btnStartOver = findViewById(R.id.musicRestart3);


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deepMusic.start();
                lottieSoundWaveSleep.playAnimation();
                lottieSoundWaveSleep.setRepeatCount(LottieDrawable.INFINITE);
            }
        });


        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deepMusic.pause(); // Pause the music
                lottieSoundWaveSleep.pauseAnimation();
            }
        });

        btnStartOver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deepMusic.seekTo(0); // Start playing the music from the beginning
                lottieSoundWaveSleep.resumeAnimation();
                lottieSoundWaveSleep.setRepeatCount(LottieDrawable.INFINITE);
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (deepMusic != null) {
            deepMusic.release();
            deepMusic = null;
            lottieSoundWaveSleep.cancelAnimation();
        }
    }
}