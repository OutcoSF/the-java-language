package com.company.object_oriented_programming;

/*
    Come back to these multiple times, OOP builds on itself and the concepts
    are hard to contextualize or understand without the full breadth of understanding.

 */

public class GoodConstructors {

    private String x;
    private String y;
    private String z;
    private String w;

    // 1st
    public GoodConstructors(){
        this("b","a"); // 2nd
    }

    // 2nd
    public GoodConstructors(String z, String w){
        this("b","a",z,w); // calls 3rd
    }

    // 3rd
    public GoodConstructors(String x, String y, String z, String w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
}
