package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 21-09-2022
 **/
public class test4 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("s");
            }
            //for stars
            int stars = (2 * i) - 1;
            for (int j = 1; j <= stars; j++) {
                if (j == 1 || j == stars || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }


    }

}
