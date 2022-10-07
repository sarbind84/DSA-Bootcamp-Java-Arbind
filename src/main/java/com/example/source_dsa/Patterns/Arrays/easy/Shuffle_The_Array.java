package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 05-10-2022
 **/
public class Shuffle_The_Array {
    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};
        int source = 0;
        int dest = 0;

        for(int i = 0;i<nums.length/2;i++){
            source = i+1;
            dest = nums.length/2+source;
            swap(nums,source,dest);
        }

    }

    private static void swap(int[] arr, int firstIndex, int lastindex) {

        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastindex];
        arr[lastindex] = temp;

    }


}
