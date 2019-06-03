package com.company.functional_programming;


/*
    For more information please see: https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static com.company.functional_programming.Person.printPersons;
import static com.company.functional_programming.Person.processElements;

public class LambdaExpressions {

    static List<Person> roster = new ArrayList<>();

    public static void main(String[] args) {

        // first lambda expression
        new Thread( () ->{
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.format("This is line %d\n", 3);
        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee joe = new Employee("Willy Doe", 45);
        Employee jack = new Employee("Zillow Hill", 19);
        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(joe);
        employees.add(jack);

        // #4 Specify Search Criteria Code in an Anonymous Class
        printPersons(
                roster,
                new CheckPerson() {
                    public boolean test(Person p) {
                        return  p.getAge() >= 18;
                    }
                }
        );

        processElements(
                roster,
                p -> p.getAge() >= 18,
                p -> p.getEmailAddress(),
                email -> System.out.println(email));
    }

    // #5 Specify Search Criteria Code with a Lambda Expression
    public static void printPersonsWithinAgeRange(List<Person> roster, int low) {
        for (Person p : roster) {
            if (low <= p.getAge()) {
                p.printPerson();
            }
        }
    }

    // #7 Use Lambda Expressions Throughout Your Application
    public static void printPersonsWithPredicate(
            List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}


