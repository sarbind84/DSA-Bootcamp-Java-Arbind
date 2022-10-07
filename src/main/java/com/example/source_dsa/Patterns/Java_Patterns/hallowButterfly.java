package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 19-09-2022
 **/
public class hallowButterfly {
    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }

            int spaces = 2 * (n-i)-1;
            for(int j=1; j<spaces; j++) {
                System.out.print("-");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        //lower part


        for (int i = n-1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }

           int spaces = 2 * (n-i)-1;
            for(int j=1; j<spaces; j++) {
                System.out.print("-");
            }


            for(int j=1; j<=i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }

            System.out.println();
        }









    }
}