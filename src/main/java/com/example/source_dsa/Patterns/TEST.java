package com.example.source_dsa.Patterns;

import java.io.StringReader;

public class TEST {
     static int fact(int n){
         if (n==1){
             return 1;
         }
         return n * fact(n-1);
     }



    public static void main(String[] args) {

        int n = 5;
        int sum = 1;

        /*//brute force approach
        for (int i = n; i >= 1; i--) {
            sum = sum *i;
        }*/
        System.out.println(fact(5));



    }
}
