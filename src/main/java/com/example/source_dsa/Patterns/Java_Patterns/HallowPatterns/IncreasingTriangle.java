package com.example.source_dsa.Patterns.Java_Patterns.HallowPatterns;

/**
 * @Author : ArbindSharma
 * @Date : 22-09-2022
 **/
public class IncreasingTriangle {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i==n||j==1||j==i){
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
