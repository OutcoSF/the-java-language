package com.company.basic_language_features;

// More on oracle docs: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
public class Operators {

    public static void main(String[] args) {
        int result = 1 + 2; // + operator
        System.out.println("1 + 2 = " + result);

        int prevResult = result;

        result = result - 1;
        System.out.println( prevResult + " result - 1 = " + result);

        result *= 10; // equivalent to result = result * 10, are they operationally equivalent in terms of run time complexity?

        prevResult = result;

        result = result / 5;
        System.out.println(prevResult + " / 5 = " + result);

        result %= 3;

        System.out.println("4 % 3 = " + result);



        /* take a look at the others on oracle docs */

        result--; // decrement
        result++; // increment

    }
}
