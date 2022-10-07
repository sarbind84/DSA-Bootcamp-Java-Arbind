package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author : ArbindSharma
 * @Date : 03-10-2022
 **/
public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1, 2, 3, 5, 6, 7};
        System.out.println(Arrays.toString(arr));

        int firstIndex = 0;
        int lastIndex = arr.length-1;

        while (firstIndex < lastIndex) {
            swap(arr, firstIndex, lastIndex);
            firstIndex++;
            lastIndex--;
        }

        System.out.println(Arrays.toString(arr));
        
    }

    private static void swap(int[] arr, int firstIndex, int lastindex) {

        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastindex];
        arr[lastindex] = temp;


    }
}
