package com.example.source_dsa.Patterns.Java_Patterns;
/**
 * @Author : ArbindSharma
 * @Date : 22-09-2022
 **/
public class HallowEquilaterealTriangle {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                if (i==n||i+j==5||j-i==3)
                System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
