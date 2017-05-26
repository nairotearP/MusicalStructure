package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Favorites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        //the button for fm radio
        Button fmButton = (Button) findViewById(R.id.fm_radio_fav_screen);
        fmButton.setOnClickListener(new View.OnClickListener() {
            //opens the fm radio activity
            @Override
            public void onClick(View view) {
                Intent fmRadio = new Intent(Favorites.this, FmRadio.class);
                startActivity(fmRadio);
            }
        });

        //the button for internet radio
        Button internetButton = (Button) findViewById(R.id.internet_radio_fav_screen);
        internetButton.setOnClickListener(new View.OnClickListener() {
            //opens the internet radio activity
            @Override
            public void onClick(View view) {
                Intent internetRadio = new Intent(Favorites.this, InternetRadio.class);
                startActivity(internetRadio);
            }
        });

        //button for my music
        Button myMusicButton = (Button) findViewById(R.id.my_music_fav_screen);
        myMusicButton.setOnClickListener(new View.OnClickListener() {
            //what to execute
            @Override
            public void onClick(View view) {
                Intent myMusic = new Intent(Favorites.this, MyMusic.class);
                startActivity(myMusic);
            }
        });
    }
}
