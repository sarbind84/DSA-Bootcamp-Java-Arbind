package com.example.source_dsa.Patterns.String.easy;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 23-11-2022
 **/
public class Longest_Common_Prefix {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        String r = "";
        int n = strs.length;
        Arrays.sort(strs);//Sorted first



        String smallestString = strs[0];//smallest no of char
        String largestString = strs[n - 1];//highest no of char
        for (int i = 0; i < smallestString.length(); i++)//taken smallest length so that run time will be less
        {
            if (smallestString.charAt(i) != largestString.charAt(i)) break;
            r = r + smallestString.charAt(i);
        }
        System.out.println(r);
    }
}
