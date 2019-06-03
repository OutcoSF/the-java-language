package com.company.basic_language_features;

// List of java keywords https://en.wikipedia.org/wiki/List_of_Java_keywords
public class Expressions {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 km
        double kilometres = (100* 1.609344);
        int highScore = 50;

        if( highScore == 50){
            System.out.println("This is an expression");
        }

        // In the below code, write down what parts of the code are expressions
        int score = 100;
        if( score > 99){
            System.out.println("You got the high score!");
            score = 0;
        }

        // expressions: score = 100, score > 99, "You got the high score!", score = 0
    }


}
