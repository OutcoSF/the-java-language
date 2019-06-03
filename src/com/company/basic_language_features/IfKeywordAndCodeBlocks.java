package com.company.basic_language_features;

// More on scope: https://www.geeksforgeeks.org/variable-scope-in-java/
//

public class IfKeywordAndCodeBlocks {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int score2 = 10000;
        int lvlCompleted = 8;
        int bonus = 200;

        /* Challenge:
        Print out a second score on the screen with the following
        score set to 10000
        lvlCompleted set to 8
        bonus set to 200
        make sure the first printout above still displays as well
         */


//        if( score == 5000) System.out.println("Your score was 5000");
//        else System.out.println("This was executed");
        if( gameOver == true){
            int finalScore = score + (lvlCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        if( score2 >= 10000){

            System.out.println("Score of 10,000 shows up " + score2);
        }

//        int savedFinalScore = finalScore; // finalScore is ONLY in scope for the codeblock


    }
}
