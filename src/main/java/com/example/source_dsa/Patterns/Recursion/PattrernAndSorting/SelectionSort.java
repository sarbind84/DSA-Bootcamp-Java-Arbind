package com.example.source_dsa.Patterns.Recursion.PattrernAndSorting;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 21-02-2023
 **/
public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr, int r, int c, int max) {

        if (r == 0) {
            return;
        }


        //yha max ko utha ke last me rakh dia hai
        if (c < r) {
            if (arr[c] > arr[max]) {
                selectionSort(arr, r, c + 1, c);
            } else {
                selectionSort(arr, r, c + 1, max);
            }
        } else {
            //r-1 is last element, so swap with it...
            //5-1 = 4
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selectionSort(arr,r-1,0,0);
        }

    }
}
