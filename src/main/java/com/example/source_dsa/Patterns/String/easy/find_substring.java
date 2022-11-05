package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 03-11-2022
 **/
public class find_substring {

    public static void main(String[] args) {

        String str = "java";


        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        }

    }
}
