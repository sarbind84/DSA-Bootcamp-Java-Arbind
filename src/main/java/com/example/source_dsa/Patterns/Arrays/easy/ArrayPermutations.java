package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 04-10-2022
 **/
public class ArrayPermutations {
    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 5, 3, 4};
        int[] ans = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        System.out.println(Arrays.toString(ans));

    }
}
