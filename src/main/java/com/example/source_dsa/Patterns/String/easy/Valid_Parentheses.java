package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 01-12-2022
 **/
public class Valid_Parentheses {
    public static void main(String[] args) {

        String s = "()[]{}";

        int count = 0;

        for (int i = 0; i < s.length()-2; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                System.out.println(true);
                count++;
            }
        }

        System.out.println(count);

    }
}
