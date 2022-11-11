package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 11-11-2022
 **/
public class Excel_Sheet_Column_Number {
    public static void main(String[] args) {

        String  columnTitle = "AB";

        int p =0 ;
        double ans = 0.0;

        for (int i = columnTitle.length()-1; i >= 0; i--) {

            char c = columnTitle.charAt(i);

            //positon in alphabet
            int val = c - 65 + 1;

            //getting values for subsequent positions
            ans = ans + Math.pow(26,p) * val;

            p++;

        }

        System.out.println( (int) ans);
    }
}
