package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MusicalStructure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musical_structure);

        //the button for fm radio
        Button fmButton = (Button) findViewById(R.id.fm_radio_main);
        fmButton.setOnClickListener(new View.OnClickListener() {
            //opens the fm radio activity
            @Override
            public void onClick(View view) {
                Intent fmRadio = new Intent(MusicalStructure.this, FmRadio.class);
                startActivity(fmRadio);
            }
        });

        //the button for internet radio
        Button internetButton = (Button) findViewById(R.id.int_radio_main);
        internetButton.setOnClickListener(new View.OnClickListener() {
            //opens the internet radio activity
            @Override
            public void onClick(View view) {
                Intent internetRadio = new Intent(MusicalStructure.this, InternetRadio.class);
                startActivity(internetRadio);
            }
        });

        //button for my music
        Button myMusicButton = (Button) findViewById(R.id.my_music_main);
        myMusicButton.setOnClickListener(new View.OnClickListener() {
            //what to execute
            @Override
            public void onClick(View view) {
                Intent myMusic = new Intent(MusicalStructure.this, MyMusic.class);
                startActivity(myMusic);
            }
        });

        //button for favorites
        Button favButton = (Button) findViewById(R.id.favorites_main);
        favButton.setOnClickListener(new View.OnClickListener() {
            //opens the favorites activity
            @Override
            public void onClick(View view) {
                Intent favorites = new Intent(MusicalStructure.this, Favorites.class);
                startActivity(favorites);
            }
        });
    }
}
