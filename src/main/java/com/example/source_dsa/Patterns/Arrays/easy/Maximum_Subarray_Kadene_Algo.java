package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 18-10-2022
 **/
public class Maximum_Subarray_Kadene_Algo {
    public static void main(String[] args) {

        int[] matrix = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] nnn = new int[matrix.length];
        int sum = 0, start = 0, end = 0, s = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {

            sum += matrix[i];

            if (max < sum) {
                max = sum;
                start = s;
                //i to last tak jegi is lia
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                //if negative then move to next element
                s = i + 1;
            }


        }

        System.out.println(max);
        int[] ints = new int[(end-start)+1];
        int j = 0;

        for (int i = start; i <= end; i++) {
            ints[j] = matrix[i];
            j++;
        }
        System.out.println(Arrays.toString(ints));


    }
}
