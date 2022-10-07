package com.example.source_dsa.Patterns.Arrays.easy;

/**
 * @Author : ArbindSharma
 * @Date : 06-10-2022
 **/
public class SmallerThanCurrentNumber {
    public static void main(String[] args) {

        int[] num = {8, 1, 2, 2, 3};
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            count=0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] != num[j]&&num[i] > num[j]) {
                        count++;
                }
            }

            System.out.println("there exist  smaller numbers than it = " + count);
        }


    }
}
