package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FmRadio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fm_radio);

        //the button for internet radio
        Button internetButton = (Button) findViewById(R.id.internet_radio_fm_screen);
        internetButton.setOnClickListener(new View.OnClickListener() {
            //opens the internet radio activity
            @Override
            public void onClick(View view) {
                Intent internetRadio = new Intent(FmRadio.this, InternetRadio.class);
                startActivity(internetRadio);
            }
        });

        //button for my music
        Button myMusicButton = (Button) findViewById(R.id.my_music_fm_screeen);
        myMusicButton.setOnClickListener(new View.OnClickListener() {
            //what to execute
            @Override
            public void onClick(View view) {
                Intent myMusic = new Intent(FmRadio.this, MyMusic.class);
                startActivity(myMusic);
            }
        });

        //button for favorites
        Button favButton = (Button) findViewById(R.id.favorites_fm_screen);
        favButton.setOnClickListener(new View.OnClickListener() {
            //opens the favorites activity
            @Override
            public void onClick(View view) {
                Intent favorites = new Intent(FmRadio.this, Favorites.class);
                startActivity(favorites);
            }
        });
    }
}