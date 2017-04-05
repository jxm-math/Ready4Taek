package com.example.android.ready4taek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for blue Player
    int scoreBluePlayer = 0;

    // Variables for other data of blue Player
    int data1Blue = 0;
    int data2Blue = 0;
    int data3Blue = 0;
    int data4Blue = 0;
    int data5Blue = 0;
    int data6Blue = 0;
    int dataFoulBlue = 0;

    // Tracks the score for red Player
    int scoreRedPlayer = 0;

    // Variables for other data of red Player
    int data1Red = 0;
    int data2Red = 0;
    int data3Red = 0;
    int data4Red = 0;
    int data5Red = 0;
    int data6Red = 0;
    int dataFoulRed = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for blue Player and updates the additional data
     */
    public void add1Blue(View v) {
        data1Blue = data1Blue + 1;
        scoreBluePlayer = scoreBluePlayer + 1;
        displayScoreForBlue();
        displayData1Blue();
    }

    public void add2Blue(View v) {
        data2Blue = data2Blue + 1;
        scoreBluePlayer = scoreBluePlayer + 1;
        displayScoreForBlue();
        displayData2Blue();
    }

    public void add3Blue(View v) {
        data3Blue = data3Blue + 1;
        scoreBluePlayer = scoreBluePlayer + 2;
        displayScoreForBlue();
        displayData3Blue();
    }

    public void add4Blue(View v) {
        data4Blue = data4Blue + 1;
        scoreBluePlayer = scoreBluePlayer + 3;
        displayScoreForBlue();
        displayData4Blue();
    }

    public void add5Blue(View v) {
        data5Blue = data5Blue + 1;
        scoreBluePlayer = scoreBluePlayer + 3;
        displayScoreForBlue();
        displayData5Blue();
    }

    public void add6Blue(View v) {
        data6Blue = data6Blue + 1;
        scoreBluePlayer = scoreBluePlayer + 4;
        displayScoreForBlue();
        displayData6Blue();
    }

    public void addFoulBlue(View v) {
        dataFoulBlue = dataFoulBlue + 1;
        scoreRedPlayer = scoreRedPlayer + 1;
        displayScoreForRed();
        displayDataFoulBlue();
    }

    /**
     * Increase the score for red Player and updates the additional data
     */
    public void add1Red(View v) {
        data1Red = data1Red + 1;
        scoreRedPlayer = scoreRedPlayer + 1;
        displayScoreForRed();
        displayData1Red();
    }

    public void add2Red(View v) {
        data2Red = data2Red + 1;
        scoreRedPlayer = scoreRedPlayer + 1;
        displayScoreForRed();
        displayData2Red();
    }

    public void add3Red(View v) {
        data3Red = data3Red + 1;
        scoreRedPlayer = scoreRedPlayer + 2;
        displayScoreForRed();
        displayData3Red();
    }

    public void add4Red(View v) {
        data4Red = data4Red + 1;
        scoreRedPlayer = scoreRedPlayer + 3;
        displayScoreForRed();
        displayData4Red();
    }

    public void add5Red(View v) {
        data5Red = data5Red + 1;
        scoreRedPlayer = scoreRedPlayer + 3;
        displayScoreForRed();
        displayData5Red();
    }

    public void add6Red(View v) {
        data6Red = data6Red + 1;
        scoreRedPlayer = scoreRedPlayer + 4;
        displayScoreForRed();
        displayData6Red();
    }

    public void addFoulRed(View v) {
        dataFoulRed = dataFoulRed + 1;
        scoreBluePlayer = scoreBluePlayer + 1;
        displayScoreForBlue();
        displayDataFoulRed();
    }

    /**
     * Resets the score for both players back to 0.
     */
    public void resetScore(View v) {
        scoreBluePlayer = 0;
        data1Blue = 0;
        data2Blue = 0;
        data3Blue = 0;
        data4Blue = 0;
        data5Blue = 0;
        data6Blue = 0;
        dataFoulBlue = 0;
        scoreRedPlayer = 0;
        data1Red = 0;
        data2Red = 0;
        data3Red = 0;
        data4Red = 0;
        data5Red = 0;
        data6Red = 0;
        dataFoulRed = 0;
        displayScoreForBlue();
        displayData1Blue();
        displayData2Blue();
        displayData3Blue();
        displayData4Blue();
        displayData5Blue();
        displayData6Blue();
        displayDataFoulBlue();
        displayScoreForRed();
        displayData1Red();
        displayData2Red();
        displayData3Red();
        displayData4Red();
        displayData5Red();
        displayData6Red();
        displayDataFoulRed();
    }

    /**
     * Displays the given score for blue Player.
     */
    public void displayScoreForBlue() {
        TextView scoreBlueView = (TextView) findViewById(R.id.blue_player_score);
        scoreBlueView.setText(String.valueOf(scoreBluePlayer));
    }

    public void displayData1Blue() {
        TextView dataView = (TextView) findViewById(R.id.blue_data1);
        dataView.setText(String.valueOf(data1Blue));
    }

    public void displayData2Blue() {
        TextView dataView = (TextView) findViewById(R.id.blue_data2);
        dataView.setText(String.valueOf(data2Blue));
    }

    public void displayData3Blue() {
        TextView dataView = (TextView) findViewById(R.id.blue_data3);
        dataView.setText(String.valueOf(data3Blue));
    }

    public void displayData4Blue() {
        TextView dataView = (TextView) findViewById(R.id.blue_data4);
        dataView.setText(String.valueOf(data4Blue));
    }

    public void displayData5Blue() {
        TextView dataView = (TextView) findViewById(R.id.blue_data5);
        dataView.setText(String.valueOf(data5Blue));
    }

    public void displayData6Blue() {
        TextView dataView = (TextView) findViewById(R.id.blue_data6);
        dataView.setText(String.valueOf(data6Blue));
    }

    public void displayDataFoulBlue() {
        TextView dataView = (TextView) findViewById(R.id.blue_data_foul);
        dataView.setText(String.valueOf(dataFoulBlue));
    }

    /**
     * Displays the given score for red Player.
     */
    public void displayScoreForRed() {
        TextView scoreRedView = (TextView) findViewById(R.id.red_player_score);
        scoreRedView.setText(String.valueOf(scoreRedPlayer));
    }

    public void displayData1Red() {
        TextView dataView = (TextView) findViewById(R.id.red_data1);
        dataView.setText(String.valueOf(data1Red));
    }

    public void displayData2Red() {
        TextView dataView = (TextView) findViewById(R.id.red_data2);
        dataView.setText(String.valueOf(data2Red));
    }

    public void displayData3Red() {
        TextView dataView = (TextView) findViewById(R.id.red_data3);
        dataView.setText(String.valueOf(data3Red));
    }

    public void displayData4Red() {
        TextView dataView = (TextView) findViewById(R.id.red_data4);
        dataView.setText(String.valueOf(data4Red));
    }

    public void displayData5Red() {
        TextView dataView = (TextView) findViewById(R.id.red_data5);
        dataView.setText(String.valueOf(data5Red));
    }

    public void displayData6Red() {
        TextView dataView = (TextView) findViewById(R.id.red_data6);
        dataView.setText(String.valueOf(data6Red));
    }

    public void displayDataFoulRed() {
        TextView dataView = (TextView) findViewById(R.id.red_data_foul);
        dataView.setText(String.valueOf(dataFoulRed));
    }
}
