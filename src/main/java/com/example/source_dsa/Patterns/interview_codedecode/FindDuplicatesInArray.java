package com.example.source_dsa.Patterns.interview_codedecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : Arbind Sharma
 * @Date : 13-04-2023
 **/
public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5, 6, 1};
        findDuplicates(arr);
    }

    private static void findDuplicates(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer a : arr) {
            if (!map.containsKey(a)) {
                map.put(a, 1);
            } else {
                map.put(a, map.get(a) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> ma : map.entrySet()) {
            if (ma.getValue()>1){
                System.out.println(ma.getKey());
            }
        }


    }
}
