package com.company.functional_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    To learn more about lambda expression see here: https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
 */

public class Main {
    public static void main(String[] args) {
        // first lambda expression
//        new Thread( () ->{
//            System.out.println("Printing from the Runnable");
//            System.out.println("Line 2");
//            System.out.format("This is line %d\n", 3);
//        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee joe = new Employee("Willy Doe", 45);
        Employee jack = new Employee("Zillow Hill", 19);
        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(joe);
        employees.add(jack);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return e1.getName().compareTo(e2.getName());
//            }
//        });
        // How does Java know the type of e1 and e2
        Collections.sort(employees, (e1, e2) ->
            e1.getName().compareTo(e2.getName()));

        for (Employee employee: employees){
            System.out.println(employee.getName());
        }

    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class CodeToRun implements Runnable{
    @Override
    public void run() {
        System.out.println("Printing from the Runnable");
    }
}