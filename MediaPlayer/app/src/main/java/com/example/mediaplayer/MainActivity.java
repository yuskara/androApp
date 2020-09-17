package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer=MediaPlayer.create(context,R.raw.love);

    }
    public void setMediaPlayer(){mediaPlayer=MediaPlayer.create(context,R.raw.love);}
    public void handlePlay(View view){mediaPlayer.start();  }
    public void handlePause(View view) {
        mediaPlayer.pause();
    }
    public void handleStop(View view) {
        mediaPlayer.stop();
        setMediaPlayer();
    }
}