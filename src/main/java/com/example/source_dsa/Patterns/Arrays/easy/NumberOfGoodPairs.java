package com.example.source_dsa.Patterns.Arrays.easy;

/**
 * @Author : ArbindSharma
 * @Date : 06-10-2022
 **/
public class NumberOfGoodPairs {
    public static void main(String[] args) {

        int[] goodPairs = {1,2,3,1,1,3};
        int count =0;

        for (int i = 0; i < goodPairs.length; i++) {
            for (int j = 0; j < goodPairs.length; j++) {
                if(goodPairs[i] == goodPairs[j] && i < j){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
