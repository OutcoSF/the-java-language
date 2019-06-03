package com.company.basic_language_features;

public class ControlFlow {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));

    }

    public static int sumDigits(int number){
        if( number < 10){
            return -1;
        }else{
            int sum = 0;
            for( int i = number; i !=0; i /= 10){
                sum += i % 10;
            }
            return sum;
        }
    }
//    public static void main(String[] args) {
//
//        int cnt = 1;
//        while(true){
//            if( cnt == 5) break;
//            System.out.println("Count value is " + cnt);
//            cnt++;
//        }
//
//        int count2 = 1;
//        do{
//            System.out.println("Count value was " + count2);
//            count2++;
//        }while (count2 != 6);
//
//    }



//    public static double calcInterest(double amount, double interestRate){
//        return( amount * (interestRate / 100));
//    }
//
//    public static boolean isPrime(int n){
//        if( n == 1) return false;
//
//        for (int i = 2; i <= (long) Math.sqrt(n); i++){
//            if( n % i == 0) return false;
//        }
//        return true;
//    }

//    public static void main(String[] args) {
//        int count = 1;
//        while( count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for( int i = 2; i <= 8; i++){
//            System.out.println("With an interest rate of: " + i + " The total interest is: "
//                    + String.format("%.2f", calcInterest(10000.0, i)));
//        }
//
//        System.out.println();
//
//        for( int i = 8; i >= 2; i--){
//            System.out.println("With an interest rate of: " + i + " The total interest is: "
//                    + String.format("%.2f", calcInterest(10000.0, i)));
//        }
//
//        int sum = 0;
//        int count = 0;
//        for( int i = 1; i <= 1000; i++ ){
//            if( i % 3 == 0 && i % 5 == 0){
//                count++;
//                sum += i;
//                System.out.println("Current number that is divisible by 3 and 5: " + i);
//            }
//            if( count == 5) break;
//        }
//        System.out.println("sum: " + sum);
//
//         For each is another loop, but we will discuss it once we cover arrays and complex data types
//
//        int switchVal = 1;
//
//        switch (switchVal){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3:
//                System.out.println("Value was 3");
//                break;
//
//            case 4: case 5:
//                System.out.println("was a 4 or a 5");
//                break;
//
//            default:
//                System.out.println("Was not 1, 2, 3, 4,or 5");
//                break;
//        }
//
//        /*
//        Challenge:
//            create a new switch statement using char instead of int
//            create a new char variable
//            create a switch statement testing for
//            A, B, C, D, or E
//            display a message if any of these are found and then break
//            Add a default which displays a msg saying not found
//         */
//
//        char charSwitch = 'B';
//
//        switch (charSwitch){
//            case 'A':
//                System.out.println("Char was A");
//                break;
//
//            case 'B':
//                System.out.println("Char was B");
//                break;
//
//            case 'C':
//                System.out.println("Char was C");
//                break;
//
//            case 'D':
//                System.out.println("Char was D");
//                break;
//
//            default:
//                System.out.println("Char was not A, B, C, D");
//                break;
//
//        }
//
//        String month = "january";
//
//        switch(month.toLowerCase()){
//            case "january":
//                System.out.println("Jan");
//                break;
//
//            case "June":
//                System.out.println("Jun");
//                break;
//
//            default:
//                System.out.println("Not sure");
//        }
//        System.out.println("10,000 at 2% interest = " + calcInterest(10000.0, 2.0));
//    }
}
