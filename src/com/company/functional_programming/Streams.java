package com.company.functional_programming;

/*
    Oracle docs on streams: https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html

    Key questions:

        1. At the most abstract level, what is a stream?


 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
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
                .stream()
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("C"))
                .sorted()
                .forEach(System.out::println);
    }
}
