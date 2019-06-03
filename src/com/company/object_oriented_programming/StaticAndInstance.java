package com.company.object_oriented_programming;

/*
    Read more about the static keyword: https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html

    Note: best practices 1 file per class, but for illustrative purposes I kept them in the same place
    to make it easier to look reference classes and examples
 */

public class StaticAndInstance {

    private static int staticVariable; // every instance of this class shares this static variable
    // therefore, if you chance it in one place, it changes everything

    // i.e. static variable scanner so all methods can access the scanner input

    private int instanceVariable; // opposite of static, each instance has it's own copy of this variable

    public StaticAndInstance(int instanceVariable) {
        // Only instance variables can be called using the this keyword
        this.instanceVariable = instanceVariable;
    }
}



class StaticMethods{

}

class Wolf{

    public void howl(){
        System.out.println("Awooo!");
    }
}

class Main2{
    public static void main(String[] args) {
        Wolf wolf = new Wolf(); // creates an instance
        wolf.howl(); // calls instance method
    }
}