package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 22-09-2022
 **/
public class testtttt {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 3 * n + 1; j++) {

                if (i + j == 5 || j - i == 3) System.out.print("*");
                else System.out.print("-");

            }
            System.out.println();




        }
    }
}
