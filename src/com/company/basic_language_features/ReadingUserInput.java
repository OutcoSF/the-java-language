package com.company.basic_language_features;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        // Challenge: Read 10 numbers from the console entered by the user and print the sum of those numbers

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers into the terminal: ");

        boolean hasNext = sc.hasNextInt();
        int count = 1;
        int sum = 0;
        if( hasNext){
            while( hasNext && count  <= 10){
                System.out.println("Enter number #" + count);
                sum += sc.nextInt();
                count++;
            }
            System.out.println("Sum of numbers entered: " + sum);
        }else{
            System.out.println("Invalid number");
        }
        sc.close();

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//        if( hasNextInt){
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); // handle next line character (enter key)
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine(); // reads a line of input to the console
//            int age = 2019 - yearOfBirth;
//
//            if( age >= 0 && age <= 100){
//                System.out.println("Your name is " + name + ", and you are " + age + " year old.");
//            } else{
//                System.out.println("Invalid year of birth");
//            }
//        } else{
//            System.out.println("Unable to parse year of birth.");
//        }
//
//        scanner.close();
    }
}
