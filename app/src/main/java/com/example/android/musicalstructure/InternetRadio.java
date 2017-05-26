package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class InternetRadio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet_radio);

        //the button for fm radio
        Button fmButton = (Button) findViewById(R.id.fm_radio_int_screen);
        fmButton.setOnClickListener(new View.OnClickListener() {
            //opens the fm radio activity
            @Override
            public void onClick(View view) {
                Intent fmRadio = new Intent(InternetRadio.this, FmRadio.class);
                startActivity(fmRadio);
            }
        });

        //button for my music
        Button myMusicButton = (Button) findViewById(R.id.my_music_int_screen);
        myMusicButton.setOnClickListener(new View.OnClickListener() {
            //what to execute
            @Override
            public void onClick(View view) {
                Intent myMusic = new Intent(InternetRadio.this, MyMusic.class);
                startActivity(myMusic);
            }
        });

        //button for favorites
        Button favButton = (Button) findViewById(R.id.favorites_int_screen);
        favButton.setOnClickListener(new View.OnClickListener() {
            //opens the favorites activity
            @Override
            public void onClick(View view) {
                Intent favorites = new Intent(InternetRadio.this, Favorites.class);
                startActivity(favorites);
            }
        });
    }
}
