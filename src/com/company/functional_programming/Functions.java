/*

    For more information please see: https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
 */

package com.company.functional_programming;

import com.company.object_oriented_programming.Musician;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

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

        Function<Musician, String> lowerCase = musician -> musician.getName().toLowerCase();

        Function<String, String> firstName = name -> name.substring(0, name.indexOf(' '));

        Function chaindFunc = lowerCase.andThen(firstName);

        System.out.println(chaindFunc.apply(musicians.get(0)));

        BiFunction<String, Musician, String> concatAge = (String name, Musician musician) -> {
            return name.concat(" " + musician.getAge());
        };

        String lowerName = lowerCase.apply(musicians.get(0));

        DoubleUnaryOperator cremBy5 = k -> k + 20.0;
        System.out.println(cremBy5.applyAsDouble(10.0));

        // Do consumers return anything?
        Consumer<String> consumer1 = str -> str.toLowerCase();
        Consumer<String> consumer2 = str -> System.out.println(str);

        consumer1.andThen(consumer2).accept("Whoopie!");
    }

    private static String getAName(Function<Musician, String> getName, Musician musician) {
        return getName.apply(musician);
    }

    private static void printMusiciansByAge(List<Musician> musicians,
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
