package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 04-10-2022
 **/
public class RunningSumOfOneArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nums));
        int[] arr = new int[nums.length];
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
        sum= sum + nums[i];
            arr[i]=sum;
        }
        System.out.println(Arrays.toString(arr));


    }
}
