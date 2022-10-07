package com.example.source_dsa.Patterns.Arrays.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 04-10-2022
 **/
public class ArrayConcatination {
    public static void main(String[] args) {

        int[] nums = {1,2,1,4};
        System.out.println(Arrays.toString(nums));

        int[] arr = new int[2*nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i+nums.length]=nums[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
