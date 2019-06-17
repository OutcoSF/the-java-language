package com.company.functional_programming;

/*
    More documentation on functional interfaces:
        http://www.dre.vanderbilt.edu/~schmidt/cs891f/2018-PDFs/03-overview-Java-8-functional-interfaces-pt1.pdf

    Key questions and key words:

        1) Multi-threading functional interfaces (FI): Runnable and Callable, what are they used for?

        2) GUIs FI: ActionListener

        3) FI for sorting objects: Comparable and Comparator

        4) What are pure FI? What does stateless have to do with purity with respect to FI?

        5) What is a callback function? What is it's purpose with respect to FI?

        6) What FI, by function type, exist and what do they do?
           Supplier, consumer, UnaryOperator, BinaryOperator, Function, Predicate.

   NOTE: I did not include an exhaustive list of these examples

 */

import java.time.LocalTime;
import java.util.Comparator;
import java.util.Objects;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        System.out.println(composeHashcodes2("Hello", "world"));
        System.out.println(composeHashcodes2("Hello", null));

        Comparator<TeamMember> byName = Comparator.comparing( tm -> tm.getName());
    }

    public static int composeHashcodes(Object o1, Object o2){
        return o1.hashCode() ^ o2.hashCode();
    }


    public static String getApplicationStatus(){
        System.out.println("getApplicationStatus called");
        return "It's " + LocalTime.now();
    }

    public static int composeHashcodes2(Object o1, Object o2){
        Objects.requireNonNull(o1, "o may not be null!" + getApplicationStatus());
        Objects.requireNonNull(o2, "o may not be null!" + getApplicationStatus());

        return o1.hashCode() ^ o2.hashCode();
    }
}

