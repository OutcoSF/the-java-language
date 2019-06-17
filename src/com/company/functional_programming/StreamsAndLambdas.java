/*
    Oracle docs on streams: https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html

    Mary had a little lambda: https://www.oracle.com/technetwork/articles/java/rich-client-lambdas-2227138.html

    Things to ponder:

        1) What types of lambda expressions exist? 3+ options exist.
        2) What are the best practices to lambda expressions?
 */

package com.company.functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAndLambdas {

    public static void main(String[] args) {
        Stream<String> ioNumStream = Stream.of("A1", "B1", "C1", "D1");
        Stream<String> inNumStream = Stream.of("W2", "W3", "W4", "W5");
        Stream<String> concatStream = Stream.concat( ioNumStream, inNumStream);

        List<String> battleShipCells = Arrays.asList(
                "A0", "A6",
                "B12", "B6",
                "C5", "C9", "C6", "C7",
                "D2", "D3", "D8",
                "E5"
        );

        // what does this chain of method calls output and what does it mean?
        System.out.println("------------------------------------------------");

        // Why should we represent chaining method calls in this format?
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());

        TeamMember will = new TeamMember("William James", 30);
        TeamMember bill = new TeamMember("Billy Jones", 45);
        TeamMember hannah = new TeamMember("Hannah Jane", 23);
        TeamMember jane = new TeamMember("Jane Doe", 55);

        Department eng = new Department("Engineering");
        eng.addTeamMember(will);
        eng.addTeamMember(bill);
        eng.addTeamMember(hannah);
        eng.addTeamMember(jane);

        System.out.println("------------------------------------------------");

        List<Department> departments = new ArrayList<>();

        departments.stream()
                    .flatMap(dep -> dep.getTeamMembers().stream())
                    .forEach(System.out::println);

        List<String> sortedNums = battleShipCells
                .stream()
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("d"))
                .sorted()
//                .collect(Collectors.toList());
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for(String s : sortedNums){
            System.out.println(s);
        }

        Map<Integer, List<TeamMember>> groupedByAge = departments.stream()
                .flatMap(dep -> dep.getTeamMembers().stream())
                .collect(Collectors.groupingBy( tm -> tm.getAge()));

        System.out.println("------------------------------------------------");

        // Why is the below code not printing? How does lazy evaluation come into play here?
        departments.stream()
                .flatMap( dep -> dep.getTeamMembers().stream())
                .reduce( (tm1, tm2) -> tm1.getAge() < tm2.getAge() ? tm1 : tm2)
                .ifPresent(System.out::println);

        Stream.of("gandalf", "frodo", "pippin", "legolas", "gimli")
                .filter( s -> {
                    System.out.println(s);
                    return s.contains("a");
                });
        // What type of operation is this?
        // and what will happen if you uncomment it and chain it to the stream?
//                .count();
    }
}
