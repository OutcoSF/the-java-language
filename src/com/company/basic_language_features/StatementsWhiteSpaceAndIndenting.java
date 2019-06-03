package com.company.basic_language_features;

public class StatementsWhiteSpaceAndIndenting {

    public static void main(String[] args) {
        String whitespaceDoesntMatter
                = " white" +
                "space " +
                "doesn't" +
                "matter" +
                "in" +
                "java";

        int myVar = 50;
        myVar++;
        myVar--;
        System.out.println("This is a test");

        System.out.println("this is "
                + " another "
                + "still more.");

        // multiple line statements
        int anotherVar = 50; myVar--; System.out.println("This is another one");
    }
}
