package com.example.source_dsa.Patterns.Recursion.PattrernAndSorting;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 20-02-2023
 **/
public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {4,3,2,1};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubble(int arr[],int r, int c) {
        //base condition
        if (r==0){
            return;
        }

        //operations
        if (c<r){
            int temp = arr[c];
            arr[c] = arr[c+1];
            arr[c+1] = temp;
            //for single iteration of the bubble sort
            bubble(arr,r,c+1);
        }else {
            //for next iteration recursion call
            bubble(arr, r-1,0);
        }

    }
}
