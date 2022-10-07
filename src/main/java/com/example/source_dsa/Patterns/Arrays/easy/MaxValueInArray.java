package com.example.source_dsa.Patterns.Arrays.easy;

/**
 * @Author : ArbindSharma
 * @Date : 03-10-2022
 **/
public class MaxValueInArray {
    public static void main(String[] args) {

        int[] arr = {1,13,4,5};
        int max = 0;
        for (int a:
             arr) {

            if(a>max){
                max = a;
            }
        }

        System.out.println(max);

    }
}
