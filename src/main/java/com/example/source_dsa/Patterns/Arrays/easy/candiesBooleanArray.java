package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author : ArbindSharma
 * @Date : 06-10-2022
 **/
public class candiesBooleanArray {
    public static void main(String[] args) {

        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(candies.length);


        List<Boolean> listOfBoolean = new ArrayList<>();


        for (int i = 0; i < candies.length; i++) {

            int sum = candies[i] + extraCandies;
            int max = maxOfArray(candies);
            if (sum>=max){
                listOfBoolean.add(true);
            }
            else {
                listOfBoolean.add(false);
            }
        }

        System.out.println(listOfBoolean);

      /*  Boolean[] listOfBoolean = new Boolean[5];


        for (int i = 0; i < candies.length; i++) {

            int sum = candies[i] + extraCandies;

            if (sum>=5){
                listOfBoolean[i]=true;
            }
            else {
                listOfBoolean[i] = false;
            }
        }

        System.out.println(Arrays.toString(listOfBoolean));*/


    }

    private static int maxOfArray(int[] candies) {
        int max=0;

        for (int i = 0; i < candies.length; i++) {
          if (candies[i]>max){
              max=candies[i];
          }

        }
        return max;
    }
}
