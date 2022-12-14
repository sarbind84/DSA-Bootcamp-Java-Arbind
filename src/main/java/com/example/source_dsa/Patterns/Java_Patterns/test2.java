package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 19-09-2022
 **/
/*
---*
--***
-*****
*******
*******
-*****
--***
---*

*/
public class test2 {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }
            int stars = (2 * i) - 1;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }
            int stars = (2 * i) - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

