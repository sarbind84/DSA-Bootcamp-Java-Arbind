package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author : ArbindSharma
 * @Date : 20-10-2022
 **/
public class test {
    public static void main(String[] args) {


       List<String> words =  new ArrayList<>();
       words.add("hello");
       words.add("hi");
       words.add("jii");

        Stream<String> stream = words.stream();
        stream.filter(e -> e.startsWith("j")).collect(Collectors.toList());
        System.out.println(words);

    }
}
