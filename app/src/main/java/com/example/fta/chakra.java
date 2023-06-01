package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.example.fta.R;

public class chakra extends AppCompatActivity {

    MediaPlayer chakraMusic;
    LottieAnimationView lottieChakra, lottieSoundWaveChakra;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chakra);


        chakraMusic = MediaPlayer.create(this, R.raw.chakra);
        lottieChakra= findViewById(R.id.lottieChakra);
        lottieSoundWaveChakra=findViewById(R.id.lottieSoundWaveChakra);



            // Find the buttons by their IDs
            Button btnPlay = findViewById(R.id.musicPlay2);
            Button btnPause = findViewById(R.id.musicPause2);
            Button btnStartOver = findViewById(R.id.musicRestart2);



           btnPlay.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   chakraMusic.start();
                   lottieChakra.playAnimation();
                   lottieChakra.setRepeatCount(LottieDrawable.INFINITE);
                   lottieSoundWaveChakra.playAnimation();
                   lottieSoundWaveChakra.setRepeatCount(LottieDrawable.INFINITE);
               }

           });


            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    chakraMusic.pause(); // Pause the music
                    lottieChakra.pauseAnimation();
                    lottieSoundWaveChakra.pauseAnimation();
                }

            });

            btnStartOver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    chakraMusic.seekTo(0); // Start playing the music from the beginning
                    lottieChakra.resumeAnimation();
                    lottieChakra.setRepeatCount(LottieDrawable.INFINITE);
                    lottieSoundWaveChakra.resumeAnimation();
                    lottieSoundWaveChakra.setRepeatCount(LottieDrawable.INFINITE);
                }
            });
        }

    @Override
    protected void onDestroy()
        {
        super.onDestroy();
        if (chakraMusic != null) {
            chakraMusic.release();
            chakraMusic = null;
            lottieChakra.cancelAnimation();
            lottieSoundWaveChakra.cancelAnimation();
         }
        }




    }
