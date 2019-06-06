package com.company.functional_programming;

import com.company.object_oriented_programming.Musician;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functions {
    public static void main(String[] args) {

        Musician hendrix = new Musician("Jimi Hendrix", 45);
        Musician paul = new Musician("Paul Mccartney", 64);
        Musician dion = new Musician("Celine Dion", 45);
        Musician z = new Musician("Jay Z ", 35);
        Musician bowe = new Musician("David Bowe", 73);
        Musician lennon = new Musician("John Lennon", 40);

        List<Musician> musicians = new ArrayList<>();
        musicians.add(hendrix);
        musicians.add(paul);
        musicians.add(dion);
        musicians.add(z);
        musicians.add(bowe);
        musicians.add(lennon);

        Function<Musician, String> getLastName = (Musician musician) -> {
            return musician.getName().substring(musician.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(musicians.get(1));

        Function<Musician, String> getFirstName = (Musician musician) -> {
            return musician.getName().substring(0, musician.getName().indexOf(' '));
        };

        Random random1 = new Random();
        for(Musician musician : musicians) {
            if(random1.nextBoolean()) {
                System.out.println(getAName(getFirstName, musician));
            } else {
                System.out.println(getAName(getLastName, musician));
            }
        }
    }

    private static String getAName(Function<Musician, String> getName, Musician musician) {
        return getName.apply(musician);
    }

    private static void printEmployeesByAge(List<Musician> musicians,
                                            String ageText,
                                            Predicate<Musician> ageCondition) {

        System.out.println(ageText);
        System.out.println("==================");
        for(Musician musician : musicians) {
            if (ageCondition.test(musician)) {
                System.out.println(musician.getName());
            }
        }
    }
}
