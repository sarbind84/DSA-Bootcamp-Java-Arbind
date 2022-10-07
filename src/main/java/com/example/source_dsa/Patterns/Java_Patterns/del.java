package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 22-09-2022
 **/
public class del {

    public static void main(String[] args) {

        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j==n/2||i==n/2)
                System.out.print("*");
                else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }

}
