package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @Author : ArbindSharma
 * @Date : 03-10-2022
 **/
public class SwapArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1, 2, 3,5,6,7};
        System.out.println(Arrays.toString(arr));
        
        int firstIndex = 1;
                int lastindex = 3;
                
        swap(arr, firstIndex,lastindex);
        System.out.println(Arrays.toString(arr));

      /*
      //for taking input and printing it in java
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        for (int a:arr) {
            System.out.println(a);
        }*/


    }

    private static void swap(int[] arr, int firstIndex, int lastindex) {

        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastindex];
        arr[lastindex]=temp;


      /*  int[] ans = new int[nums.length];
        int n = nums.length / 2;
        int j = 0;


        for (int i = 0; i < 2*n; i=i+2) {
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
            j++;
        }
        System.out.println(Arrays.toString(ans));*/


    }
}
