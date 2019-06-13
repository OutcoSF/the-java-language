package com.company.functional_programming;

/*

    For more information on accessing local variables in scope:
    https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html#accessing-local-variables

    Note: best practices 1 file per class, but for illustrative purposes I kept them in the same place
    to make it easier to look reference classes and examples

    Key questions:

        1. Why are is the final keyword important when dealing with lambdas?

        2. What role does runtime evaluation play when assessing lambda expressions?
 */

public class FPAndScope {

    public static void main(String[] args) {

    }

}


interface Concat {
    public String upperAndConcat(String s1, String s2);
}

class SecondClass {

    public String action() {
        int k = 0;

        Concat c = (s1, s2) -> {
            System.out.println("The lambda expression:  " + getClass().getSimpleName());
            System.out.println("k = " + k);
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
        return TeamMember.stringing(c,"String1","String2");

    }

    public void printValue() {

        int number = 10;

        Runnable r = () -> {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value is " + number);
        };

        new Thread(r).start();
    }
}