package com.example.source_dsa.Patterns.interview_codedecode;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @Author : ArbindSharma
 * @Date : 07-04-2023
 **/
public class GroupBy {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("alice","bib","fred","flower","tiger");

        //e -> e.charAt(0) ==> classifier -> test condition --> classifier function.
        //TreeMap::new ==> sorting to ascending order --> MapFactory function
        //Collectors to set as it contains unique names. --> downstream function


        //classifier function defines the key element in the method f=[fred, flower]
        //sorting mapFactory function to determine the type of the Map.
        //the downstream collector how the values are collected.

        TreeMap<Character, Set<String>> r = names.stream().collect(Collectors.groupingBy(e -> e.charAt(0), TreeMap::new, Collectors.toSet()));
        System.out.println(r);


    }
}
