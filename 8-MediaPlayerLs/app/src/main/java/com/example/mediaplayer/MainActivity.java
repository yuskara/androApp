package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    TextView textView;
    Spinner spinner;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    public void init() {

        textView = findViewById(R.id.textView);
        spinner = findViewById(R.id.dropdown);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(mediaPlayer != null){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    }
                Uri uri = Uri.parse("android.resource://com.example.mediaplayer/raw/" + adapterView.getSelectedItem());
                textView.setText(adapterView.getSelectedItem().toString());

                mediaPlayer = MediaPlayer.create(context, uri);
                mediaPlayer.start();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    //////////button click events
    public void handlePlay(View view) {
        try {
            mediaPlayer.start();
        } catch (Exception e) {
            textView.setText("err: " + e);
        }
        Toast.makeText(context, "Play", Toast.LENGTH_LONG).show();
    }

    public void handlePause(View view) {
        mediaPlayer.pause();
        Toast.makeText(context, "Pause", Toast.LENGTH_LONG).show();
    }

    public void handleStop(View view) {
        mediaPlayer.stop();
        Toast.makeText(context, "Stop", Toast.LENGTH_LONG).show();
    }
}
