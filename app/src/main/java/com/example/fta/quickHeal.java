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

public class quickHeal extends AppCompatActivity {

    MediaPlayer quickMusic;
    LottieAnimationView lottieQuickHeal, lottieSoundWaveQuick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_heal);



        quickMusic = MediaPlayer.create(this, R.raw.minute20);
        lottieQuickHeal= findViewById(R.id.lottieQuickHeal);
        lottieSoundWaveQuick=findViewById(R.id.lottieSoundWaveQuick);


        // Find the buttons by their IDs
        ImageButton btnPlay = findViewById(R.id.musicPlay1);
        ImageButton btnPause = findViewById(R.id.musicPause1);
        ImageButton btnStartOver = findViewById(R.id.musicRestart1);


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quickMusic.start();
                lottieQuickHeal.playAnimation();
                lottieQuickHeal.setRepeatCount(LottieDrawable.INFINITE);
                lottieSoundWaveQuick.playAnimation();
                lottieSoundWaveQuick.setRepeatCount(LottieDrawable.INFINITE);
            }
        });


        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quickMusic.pause(); // Pause the music
                lottieQuickHeal.pauseAnimation();
                lottieSoundWaveQuick.pauseAnimation();
            }
        });

        btnStartOver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quickMusic.seekTo(0); // Start playing the music from the beginning
                lottieQuickHeal.resumeAnimation();
                lottieQuickHeal.setRepeatCount(LottieDrawable.INFINITE);
                lottieSoundWaveQuick.resumeAnimation();
                lottieSoundWaveQuick.setRepeatCount(LottieDrawable.INFINITE);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (quickMusic != null) {
            quickMusic.release();
            quickMusic = null;
            lottieQuickHeal.cancelAnimation();
            lottieSoundWaveQuick.cancelAnimation();
        }
    }

}