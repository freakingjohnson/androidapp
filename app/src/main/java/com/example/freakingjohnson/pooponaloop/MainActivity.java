package com.example.freakingjohnson.pooponaloop;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    MediaPlayer fartsound;
    boolean isPlaying =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fartsound = MediaPlayer.create(this, R.raw.farts);

    }

    public void farts (View view) {
        if(isPlaying) {
            fartsound.pause();
        }else{
            fartsound.start();
            fartsound.setLooping(true);
        }
        isPlaying = !isPlaying;
    }

}
