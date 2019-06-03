package com.company.basic_language_features;

public class ParsingString {

    public static void main(String[] args) {

        String numAsString = "2019.125";
        System.out.println("Number as string = " + numAsString);

        double num = Double.parseDouble(numAsString);
        System.out.println("Number = " + num);

        numAsString += 1;
        num += 1;

        System.out.println("number as string = " + numAsString);
        System.out.println("number = "+ num);
    }
}
