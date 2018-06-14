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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayOver(0);
        displayRunRate(0);
    }

    public void oneScoreForTeam(View v) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
        overA = overs(overA);
        displayOver(overA);
        numberOfBalls = numberOfBalls + 1;
        runRateA = runRate(runRateA);
        displayRunRate(runRateA);
    }

    public void fourScoreForTeam(View v) {
        scoreA = scoreA + 4;
        displayForTeamA(scoreA);
        overA = overs(overA);
        displayOver(overA);
        numberOfBalls = numberOfBalls + 1;
        runRateA = runRate(runRateA);
        displayRunRate(runRateA);
    }

    public void sixScoreForTeam(View v) {
        scoreA = scoreA + 6;
        displayForTeamA(scoreA);
        overA = overs(overA);
        displayOver(overA);
        numberOfBalls = numberOfBalls + 1;
        runRateA = runRate(runRateA);
        displayRunRate(runRateA);
    }

    public void dotScoreForTeam(View v) {
        displayForTeamA(scoreA);
        overA = overs(overA);
        displayOver(overA);
        numberOfBalls = numberOfBalls + 1;
        runRateA = runRate(runRateA);
        displayRunRate(runRateA);
    }

    public void out(View v) {
        scoreA = 0;
        overA = 0;
        runRateA = 0;
        numberOfBalls = 0;
        displayOver(0);
        displayRunRate(0);
        displayForTeamA(0);
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
        runRate = (double) (scoreA / numberOfBalls);
        return runRate;
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOver(double over) {
        TextView overView = (TextView) findViewById(R.id.over_text_view);
        overView.setText(new DecimalFormat("##.#").format(over));
    }

    public void displayRunRate(double runRatee) {
        TextView runRateView = (TextView) findViewById(R.id.runRate_text_view);
        runRateView.setText(new DecimalFormat("##.##").format(runRatee));
    }
}
