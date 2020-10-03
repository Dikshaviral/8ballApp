package com.example.taptap;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class firstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        final MediaPlayer drumMediaplayer = MediaPlayer.create(this, R.raw.drum6);
        final MediaPlayer onemediaplayer = MediaPlayer.create(this,R.raw.drum1);
        final MediaPlayer twomediaplayer = MediaPlayer.create(this,R.raw.drum3);
        final MediaPlayer threemediaplayer = MediaPlayer.create(this,R.raw.drum2);
        final MediaPlayer fourmediaplayer = MediaPlayer.create(this,R.raw.drum4);
        final MediaPlayer fivemediaplayer = MediaPlayer.create(this,R.raw.drum5);
        final MediaPlayer sixmediaplayer = MediaPlayer.create(this,R.raw.first_beat);

        final FloatingActionButton drum = (FloatingActionButton) this.findViewById(R.id.drum1);
        final FloatingActionButton drum2 = (FloatingActionButton) this.findViewById(R.id.d2);
        final FloatingActionButton drum3 = (FloatingActionButton) this.findViewById(R.id.d3) ;
        final FloatingActionButton drum4 = (FloatingActionButton) this.findViewById(R.id.d4) ;
        final FloatingActionButton drum5 = (FloatingActionButton) this.findViewById(R.id.d5) ;
        final FloatingActionButton drum6 = (FloatingActionButton) this.findViewById(R.id.d6) ;
        final ImageButton beat = (ImageButton) this.findViewById(R.id.ib1) ;



        drum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drumMediaplayer.start();
            }
        });

        drum2.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                      onemediaplayer.start();
                                     }
                                 }

        );

        drum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                twomediaplayer.start();
            }
        }

        );
        drum4.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         threemediaplayer.start();
                                     }
                                 }

        );
        drum5.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         fourmediaplayer.start();
                                     }
                                 }

        );
        drum6.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         fivemediaplayer.start();
                                     }
                                 }

        );
        beat.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         sixmediaplayer.start();
                                     }
                                 }

        );
    }
}