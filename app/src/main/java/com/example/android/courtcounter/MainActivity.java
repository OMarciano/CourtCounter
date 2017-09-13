package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);


    }

    int placar;
    int placarb;

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.placar_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreViewB = (TextView) findViewById(R.id.placar_b_text_view);
        scoreViewB.setText(String.valueOf(score));
    }

    public void incPlacar3(View View){
        placar = placar + 3;
        displayForTeamA(placar);
    }

    public void incPlacar2(View View){
        placar = placar + 2;
        displayForTeamA(placar);
    }

    public void incPlacar1(View View){
        placar = placar + 1;
        displayForTeamA(placar);
    }

    public void incPlacar3b(View view){
        placarb = placarb + 3;
        displayForTeamB(placarb);
    }

    public void incPlacar2b(View view){
        placarb = placarb + 2;
        displayForTeamB(placarb);
    }

    public void incPlacarb1(View view){
        placarb = placarb + 1;
        displayForTeamB(placarb);
    }

    public void reset(View view){
        placar = 0;
        placarb = 0;
        displayForTeamA(placar);
        displayForTeamB(placarb);
    }
}


