package com.example.source_dsa.Patterns.HallowPatterns.Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 24-10-2022
 **/
public class Matrix_Indices {
    static int i = 5;

    public static void main(String[] args) {
        int n = Matrix_Indices.i;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1)
                    System.out.print(" *");
                else {
                    System.out.print(" -");
                }
            }
            System.out.println();
        }
    }
}
