package com.company.basic_language_features;


// Note: String is NOT a primitive types, it is a class. We will get into non-primitive data types more later in this
// directory
public class Strings {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
//        myString = myString + ", and this is more.";

        myString += myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString += "49.95";
        System.out.println("The result is " + numberString); // no operations were used, we need a data type that
        //supports numeric operations. Hmm, what could that be?

        String lastString = "10";
        int myInt = 50;
        lastString += myInt;
        System.out.println("LastString is equal to " + lastString); // What happens?
        double doubleNumber = 120.47;
        lastString += doubleNumber;
        System.out.println("LastString value: " + lastString);
    }
}
