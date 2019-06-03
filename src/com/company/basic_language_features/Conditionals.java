package com.company.basic_language_features;

// Please see oracle docs: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html

public class Conditionals {

    public static void main(String[] args) {
        boolean isAlien = true;

        if( isAlien == true) System.out.println("It is an alien!");

        // alternatively you can write it like this for simplicity
        if(isAlien) System.out.println("It is still an alien!!");

        int topScore = 100;
        if( topScore >= 100) System.out.println("You got the high score");

        int secondTopScore = 60;
        if( topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less than 100");

        if( (topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if( newValue == 50) System.out.println("equivalence check");

        boolean isCar = false;
        if( isCar = true) System.out.println("This is not supposed to happen");


        boolean wasCar = isCar ? true: false; // ternary operator  if true else false

        if( wasCar) System.out.println("wasCar is true");

        /*
            1. Create a double variable with the value 20
            2. Create a second variable of type double with the value 80
            3. Add both numbers up and multiple by 25
            4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
            5. Write an "if" statement that displays a message "Total was over the limit"
         */

        double valTwenty = 20;
        double valEighty = 80;
        double result = (valTwenty * valEighty) * 25.0;
        double remainder = result % 40.0;
        if(remainder <= 20) System.out.println("Total was over the limit");
    }
}
