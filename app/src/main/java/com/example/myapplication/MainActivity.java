package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score1 = 0;
    int score2=0;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score1", score1);
        outState.putInt("score2", score2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null){
            score1=savedInstanceState.getInt("score1");
            score2=savedInstanceState.getInt("score2");
        }
        Button btnTeam1 = findViewById(R.id.btn_team_1);
        TextView result1 = findViewById(R.id.res_team_1);

        result1.setText(String.valueOf(score1));

        Button btnTeam2 = findViewById(R.id.btn_team_2);
        TextView result2 = findViewById(R.id.res_team_2);

        result2.setText(String.valueOf(score2));
        btnTeam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result1.setText(String.valueOf(++score1));
            }
        });

        btnTeam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result2.setText(String.valueOf(++score2));
            }
        });


    }
}