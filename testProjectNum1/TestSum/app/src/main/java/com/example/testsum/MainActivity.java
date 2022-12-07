package com.example.testsum;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView countView ;
    Button clickBtn;
    int count =0;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countView = findViewById(R.id.counter);
        clickBtn= findViewById(R.id.click_btn);
        player = MediaPlayer.create(this, R.raw.shortclick);



        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;

                if (player.isPlaying()) player.stop();
                player.start();
                countView.setText(String.valueOf(count));
            }
        });


    }
}