package com.company.functional_programming;

/*
    Oracle docs on streams: https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html

    Key questions:

        1. At the most abstract level, what is a stream?
        2. What is a stream pipeline?
        3. Key words: stream pipeline, chain of stream source, intermediate operations, and terminal operation
        4. Intermediate operations are evaluated lazily, what does that mean in terms of operations?

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a1", "a2", "a3");
        Optional<String> stream = list.stream().filter(element -> {
            System.out.println("filter() was called");
            return element.contains("2");
        }).map(element -> {
            System.out.println("map() was called");
            return element.toUpperCase();
        }).findFirst();

        System.out.println(stream);

        List<String> battleShipCells = Arrays.asList(
            "A0", "A6",
            "B12", "B6",
            "C5", "C9", "C6", "C7",
            "D2", "D3", "D8",
            "E5"
        );

        List<String> cNums = new ArrayList<>();

//        Streams!
        battleShipCells
                .stream() //start
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("c"))
                .sorted()
                .forEach(System.out::println);

    }
}
