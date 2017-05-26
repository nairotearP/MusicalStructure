package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MyMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        //the button for fm radio
        Button fmButton = (Button) findViewById(R.id.fm_radio_my_screen);
        fmButton.setOnClickListener(new View.OnClickListener() {
            //opens the fm radio activity
            @Override
            public void onClick(View view) {
                Intent fmRadio = new Intent(MyMusic.this, FmRadio.class);
                startActivity(fmRadio);
            }
        });

        //the button for internet radio
        Button internetButton = (Button) findViewById(R.id.internet_radio_my_screen);
        internetButton.setOnClickListener(new View.OnClickListener() {
            //opens the internet radio activity
            @Override
            public void onClick(View view) {
                Intent internetRadio = new Intent(MyMusic.this, InternetRadio.class);
                startActivity(internetRadio);
            }
        });

        //button for favorites
        Button favButton = (Button) findViewById(R.id.favorites_my_screen);
        favButton.setOnClickListener(new View.OnClickListener() {
            //opens the favorites activity
            @Override
            public void onClick(View view) {
                Intent favorites = new Intent(MyMusic.this, Favorites.class);
                startActivity(favorites);
            }
        });
    }
}
