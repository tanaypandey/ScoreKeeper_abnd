package com.example.android.scorekeeper_abnd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    double overA = 0;
    double runRateA = 0;
    int numberOfBalls = 0;
    int scoreB = 0;
    double overB = 0;
    double runRateB = 0;
    int numberOfBallsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayOverA(0);
        displayRunRateA(0);
        displayForTeamB(0);
        displayOverB(0);
        displayRunRateB(0);
    }

    public void oneScoreForTeamA(View v) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
        overA = overs(overA);
        displayOverA(overA);
        numberOfBalls = numberOfBalls + 1;
        runRateA = runRate(runRateA);
        displayRunRateA(runRateA);
    }

    public void fourScoreForTeamA(View v) {
        scoreA = scoreA + 4;
        displayForTeamA(scoreA);
        overA = overs(overA);
        displayOverA(overA);
        numberOfBalls = numberOfBalls + 1;
        runRateA = runRate(runRateA);
        displayRunRateA(runRateA);
    }

    public void sixScoreForTeamA(View v) {
        scoreA = scoreA + 6;
        displayForTeamA(scoreA);
        overA = overs(overA);
        displayOverA(overA);
        numberOfBalls = numberOfBalls + 1;
        runRateA = runRate(runRateA);
        displayRunRateA(runRateA);
    }

    public void dotScoreForTeamA(View v) {
        displayForTeamA(scoreA);
        overA = overs(overA);
        displayOverA(overA);
        numberOfBalls = numberOfBalls + 1;
        runRateA = runRate(runRateA);
        displayRunRateA(runRateA);
    }

    public void outA(View v) {
        scoreA = 0;
        overA = 0;
        runRateA = 0;
        numberOfBalls = 0;
        displayOverA(0);
        displayRunRateA(0);
        displayForTeamA(0);
    }

    public void oneScoreForTeamB(View v) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
        overB = overs(overB);
        displayOverB(overB);
        numberOfBallsB = numberOfBallsB + 1;
        runRateB = runRate(runRateB);
        displayRunRateB(runRateB);
    }

    public void fourScoreForTeamB(View v) {
        scoreB = scoreB + 4;
        displayForTeamB(scoreB);
        overB = overs(overB);
        displayOverB(overB);
        numberOfBallsB = numberOfBallsB + 1;
        runRateB = runRate(runRateB);
        displayRunRateB(runRateB);
    }

    public void sixScoreForTeamB(View v) {
        scoreB = scoreB + 6;
        displayForTeamB(scoreB);
        overB = overs(overB);
        displayOverB(overB);
        numberOfBallsB = numberOfBallsB + 1;
        runRateB = runRate(runRateB);
        displayRunRateB(runRateB);
    }

    public void dotScoreForTeamB(View v) {
        displayForTeamB(scoreB);
        overB = overs(overB);
        displayOverB(overB);
        numberOfBallsB = numberOfBallsB + 1;
        runRateB = runRate(runRateB);
        displayRunRateB(runRateB);
    }

    public void outB(View v) {
        scoreB = 0;
        overB = 0;
        runRateB = 0;
        numberOfBallsB = 0;
        displayOverB(0);
        displayRunRateB(0);
        displayForTeamB(0);
    }

    public double overs(double over) {
        if ((over - (int) over) >= 0.6) {
            over = (int) over + 1;
            return over;
        } else {
            over = over + 0.1;
            return over;
        }
    }

    public double runRate(double runRate) {
        runRate = (double) (scoreB / numberOfBallsB);
        return runRate;
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOverA(double over) {
        TextView overView = (TextView) findViewById(R.id.over_text_view);
        overView.setText(new DecimalFormat("##.#").format(over));
    }

    public void displayRunRateA(double runRatee) {
        TextView runRateView = (TextView) findViewById(R.id.runRate_text_view);
        runRateView.setText(new DecimalFormat("##.##").format(runRatee));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOverB(double over) {
        TextView overView = (TextView) findViewById(R.id.over_b_text_view);
        overView.setText(new DecimalFormat("##.#").format(over));
    }

    public void displayRunRateB(double runRatee) {
        TextView runRateView = (TextView) findViewById(R.id.runRate_b_text_view);
        runRateView.setText(new DecimalFormat("##.##").format(runRatee));
    }
}
