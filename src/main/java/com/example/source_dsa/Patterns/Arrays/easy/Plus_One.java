package com.example.source_dsa.Patterns.Arrays.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 18-10-2022
 **/
public class Plus_One {
    public static void main(String[] args) {

        int[] intArrs = {1, 2, 3};
        int[] intArrsreturn = new int[intArrs.length];


        StringBuilder builder = new StringBuilder();
        for (int num : intArrs) {
            builder.append(num);
        }
        int number = Integer.parseInt(builder.toString());
        int plusOne = number + 1;


        String s = Integer.toString(plusOne);
        System.out.println(s.length());


        for (int i = 0; i < s.length(); i++) {
            intArrsreturn[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }


        System.out.println(Arrays.toString(intArrsreturn));
    }


}

