package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 17-10-2022
 **/
public class Find_N_Unique_Integers_Sum_up_to_Zero {
    public static void main(String[] args) {

        int n = 5;

        int[] returnArray = new int[n];

        if (n%2==0){

            for (int i = 0; i < n-1; i=i+2) {
                returnArray[i] = -(i+1);
                returnArray[i+1] = i+1;
            }

        }else {
            for (int i = 0; i < n-1; i=i+2) {
                returnArray[i] = i+1;
                returnArray[i+1] = -(i+1);
            }
            returnArray[n-1] = 0;
        }

        System.out.println(Arrays.toString(returnArray));

    }
}
