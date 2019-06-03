package com.company.basic_language_features;

public class Methods {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int lvlCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score, lvlCompleted, bonus);

        score = 10000;
        lvlCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, lvlCompleted, bonus); // adding these: gameOver, score, etc. are called arguments here
        System.out.println("Your final score was " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){ // gameOver, score, etc are parameters

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1; // conventionally used to return an error.

    }
}
