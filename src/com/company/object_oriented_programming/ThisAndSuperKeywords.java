package com.company.object_oriented_programming;

/*
    this keyword: https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
    super keyword: https://docs.oracle.com/javase/tutorial/java/IandI/super.html

    NOTE: 1 class per file is best practice, I did this for illustrative purposes
    so you don't have to look through multiple files
 */

public class ThisAndSuperKeywords {
}


class SuperClass{
    public void printMethod(){
        System.out.println("Superclass");
    }
}

class SubClass extends SuperClass{

    // Java Compiler puts a default call to super() if it is not added
    // it is always the no-args super which is inserted by the compiler

    @Override
    public void printMethod(){
        super.printMethod();
        System.out.println("Subclass");
    }
}

class MainClass{
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();
    }
}


