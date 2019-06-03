package com.company.basic_language_features;

// Primitive types: byte, short, int, long, float, double, char, boolean
// More on oracle docs: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
public class Primitives {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = 'D'; // can only store one letter, Unicode characters as well (special characters)
        // https://unicode-table.com/en/
        char char2 = '\u00A9'; //unicode character
        System.out.println("Unicode out: " + char2);

        boolean myBoolean = true;
        boolean isHotdog = false; // reference to silicon valley's hotdog or not hotdog, google it

        /*
            1. Find the code for the registered symbol on the same line as the copyright symbol.
            2. Create a variable of type char and assign it the unicode value for that symbol
            3. Display in on screen.

            Solution after this class, but try it yourself
         */

    }
}



//
//
//    char registerSymbol = '\u00AE';
//        System.out.println("Unicode register symbol: " + registerSymbol);
