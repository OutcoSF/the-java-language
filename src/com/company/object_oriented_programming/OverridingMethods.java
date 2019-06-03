package com.company.object_oriented_programming;

/*
    More info: https://docs.oracle.com/javase/tutorial/java/IandI/override.html

    Only instance methods can be overridden, not static methods

    Difference between overloading and overriding: https://stackoverflow.com/questions/837864/java-overloading-vs-overriding

    Note: best practices 1 file per class, but for illustrative purposes I kept them in the same place
    to make it easier to reference classes and examples
 */

public class OverridingMethods {


}


class Mammal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}


class Cat extends Mammal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Mammal myAnimal = myCat;
        Mammal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}