package com.example.source_dsa.Patterns.Arrays.easy;

/**
 * @Author : ArbindSharma
 * @Date : 18-10-2022
 **/
public class Maximum_Subarray_Kadene_Algo {
    public static void main(String[] args) {

        int[] matrix = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] att = new int[matrix.length];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {

            sum += matrix[i];

            if (max<sum){
                max=sum;
            }

            if (sum<0)
            {
                sum=0;
            }


        }

        System.out.println(max);


    }
}
