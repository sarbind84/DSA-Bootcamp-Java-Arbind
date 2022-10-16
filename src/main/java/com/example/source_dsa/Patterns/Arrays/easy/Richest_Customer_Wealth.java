package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 05-10-2022
 **/
public class Richest_Customer_Wealth {
    public static void main(String[] args) {

        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };

        for (int[] a :  accounts) {
            System.out.println(Arrays.toString(a));
        }

        int wealth = -1;
        for(int i = 0; i < accounts.length; i++) {
            int temp_sum = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                temp_sum = temp_sum + accounts[i][j];
            }
            if(temp_sum > wealth) {
                wealth = temp_sum;
            }
        }
        System.out.println(wealth);


        /*int temp_sum = 0;
        int wealth = -1;
        int index = 0;
        System.out.println("array length = "+accounts.length);

        for (int i = 0; i < accounts.length; i++) {
            temp_sum = 0;
            for (int j = 0; j <= accounts.length; j++) {
                temp_sum = temp_sum + accounts[i][j];
            }
            if(temp_sum>wealth){
                wealth = temp_sum;
                index = i;
            }

        }

        System.out.println("Sum temp_sum = "+temp_sum);
        System.out.println("Max temp_sum = "+wealth);
        System.out.println("Wealthiest index = "+index);*/

    }
}
