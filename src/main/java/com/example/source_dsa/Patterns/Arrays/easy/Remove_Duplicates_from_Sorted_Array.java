package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author : ArbindSharma
 * @Date : 19-10-2022
 **/
public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {


/*
        Set<Integer> set = new HashSet<>();
        int count=0;

        for (int eachElement : Array) {
            if (set.contains(eachElement)){
                System.out.print(eachElement);
                count++;
            }
            set.add(eachElement);
        }
        System.out.println();
        System.out.println(count);*/


       /* int n = myArrray.length;

        int count = 0;
        for (int i = 1; i < n; i++) {
            if (myArrray[i] == myArrray[i - 1]) count++;
            else myArrray[i - count] = myArrray[i];
        }
        System.out.println(n - count);

        System.out.println(Arrays.toString(myArrray));*/
        int[] myArrray = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        Map<Integer, Integer> map = new HashMap<>();

        for (int number : myArrray) {
            Integer count = map.get(number);

            if (count == null) {
                map.put(number, 1);
            } else {
                count=count+1;
                map.put(number, count);
            }
        }
        System.out.println("Duplicates elements are");
        Set<Map.Entry<Integer, Integer>> es = map.entrySet();

        for (Map.Entry<Integer, Integer> me : es) {
            if(me.getValue()>1){
                System.out.print(me.getKey());
            }
        }




    }
}
