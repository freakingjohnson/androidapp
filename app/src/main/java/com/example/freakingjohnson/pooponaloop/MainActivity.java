package com.example.freakingjohnson.pooponaloop;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    MediaPlayer fartSound;
    boolean isPlaying =false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ImageButton playBtn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fartSound = MediaPlayer.create(this, R.raw.farts);
        playBtn = findViewById(R.id.playButton);
        playBtn.setImageResource(R.drawable.play);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying) {
                    fartSound.pause();
                    playBtn.setImageResource(R.drawable.play);
                } else {
                    fartSound.start();
                    fartSound.setLooping(true);
                    playBtn.setImageResource(R.drawable.pause);
                }
                isPlaying = !isPlaying;
            }
        });
    }
}
