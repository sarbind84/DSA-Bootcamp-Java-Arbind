package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 19-09-2022
 **/
public class HallowRectangle {

    public static void main(String[] args) {
        //n =4;
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}

