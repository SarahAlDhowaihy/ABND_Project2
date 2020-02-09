package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int goalOfTeamA = 0;
    public int foulsOfTeamA = 0;
    public int playerFoulsOfTeamA = 0;
    public int goalOfTeamB = 0;
    public int foulsOfTeamB = 0;
    public int playerFoulsOfTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_team_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_team_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_team_a);
        scoreView.setText(String.valueOf(score));
    }


    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_team_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPlayerFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.playerFouls_team_a);
        scoreView.setText(String.valueOf(score));
    }


    public void displayPlayerFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.playerFouls_team_b);
        scoreView.setText(String.valueOf(score));
    }

    public void goalForTeamA(View view) {
        goalOfTeamA = goalOfTeamA + 1;
        displayGoalForTeamA(goalOfTeamA);
        displayMessage("GOOOOOAL FOR AL-Hilal");
    }

    public void goalForTeamB(View view) {
        goalOfTeamB = goalOfTeamB + 1;
        displayGoalForTeamB(goalOfTeamB);
        displayMessage("GOOOOOAL FOR AL-Nassr");
    }

    public void foulsOfTeamA(View view) {
        foulsOfTeamA = foulsOfTeamA + 1;
        displayFoulsForTeamA(foulsOfTeamA);
        displayMessage("Fouls from AL-Hilal");
    }

    public void foulsOfTeamB(View view) {
        foulsOfTeamB = foulsOfTeamB + 1;
        displayFoulsForTeamB(foulsOfTeamB);
        displayMessage("Fouls from AL-Nassr");
    }

    public void playerFoulsOfTeamA(View view) {
        playerFoulsOfTeamA = playerFoulsOfTeamA + 1;
        displayPlayerFoulsForTeamA(playerFoulsOfTeamA);
        displayMessage("Player Fouls from AL-Hilal");
    }

    public void playerfoulsOfTeamB(View view) {
        playerFoulsOfTeamB = playerFoulsOfTeamB + 1;
        displayPlayerFoulsForTeamB(playerFoulsOfTeamB);
        displayMessage("Player Fouls from AL-Nassr");
    }

    public void reset(View view) {
        playerFoulsOfTeamB = 0;
        playerFoulsOfTeamA = 0;
        goalOfTeamA = 0;
        goalOfTeamB = 0;
        foulsOfTeamB = 0;
        foulsOfTeamA = 0;
        displayGoalForTeamA(goalOfTeamA);
        displayFoulsForTeamA(foulsOfTeamA);
        displayPlayerFoulsForTeamA(playerFoulsOfTeamA);
        displayGoalForTeamB(goalOfTeamB);
        displayFoulsForTeamB(foulsOfTeamB);
        displayPlayerFoulsForTeamB(playerFoulsOfTeamB);
        displayMessage("Welcome To Score Keeper");
    }


    public void displayMessage(String mess) {
        TextView scoreView = (TextView) findViewById(R.id.message);
        scoreView.setText(String.valueOf(mess));
    }

}
