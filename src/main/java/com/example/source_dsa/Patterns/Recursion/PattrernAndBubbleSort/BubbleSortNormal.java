package com.example.source_dsa.Patterns.Recursion.PattrernAndBubbleSort;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 20-02-2023
 **/
public class BubbleSortNormal {
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("next iteration");
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
