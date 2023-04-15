package com.example.source_dsa.Patterns.interview_codedecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author : ArbindSharma
 * @Date : 09-04-2023
 **/
public class MinMxAverageSum {
    public static void main(String[] args) {

        List<Integer> ages = Stream.of(10,20,30,40).collect(Collectors.toList());
        List<Integer> ageCount = Arrays.asList(10,2,3,49,5).stream().collect(Collectors.toList());

        Stream<Integer> sorted = ageCount.stream().sorted();
        System.out.println(sorted.collect(Collectors.toList()));

        IntSummaryStatistics intSummaryStatistics = ageCount.stream().sorted().mapToInt(x -> x).summaryStatistics();
        int min = intSummaryStatistics.getMin();
        int max = intSummaryStatistics.getMax();
        long sum = intSummaryStatistics.getSum();
        double average = intSummaryStatistics.getAverage();
        long count = intSummaryStatistics.getCount();
        System.out.println(intSummaryStatistics);
        System.out.println(min + " " + max + " " +sum + " " +average);

        List<Integer> collect = ages.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println("collect = "+collect);

        //convert the string to uppercase and join them with commas
        String collect1 = ageCount.stream().map(x -> x.toString().toUpperCase()).collect(Collectors.joining(",  "));
        System.out.println("In upper Alphabets = "+collect1);


        List<List<Integer>> lists = List.of(ageCount);
        System.out.println("list += "+lists);

        Stream<Integer> ageStream = Stream.of(10, 20, 30, 40, 50);
        IntSummaryStatistics stats = ageStream.mapToInt(x -> x).summaryStatistics();

        System.out.println("Stats  = "+stats.getMin());

        List<Integer> ageStream1 = Arrays.asList(12,13,14,14);

        Object[] objects = ageStream1.stream().map(Integer::new).toArray();
        int[] ints = ageStream1.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("=="+Arrays.toString(ints));


    }
}
