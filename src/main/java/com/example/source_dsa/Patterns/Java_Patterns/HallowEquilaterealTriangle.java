package com.example.source_dsa.Patterns.Java_Patterns;
/**
 * @Author : ArbindSharma
 * @Date : 22-09-2022
 **/
public class HallowEquilaterealTriangle {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }
            int spaces = (2 * i) - 1;
            for (int j = 1; j <= spaces; j++) {
                if (j == 1 || j == spaces || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print("s");
                }
            }
            System.out.println();
        }

    }
}
