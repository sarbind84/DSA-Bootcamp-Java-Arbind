package com.example.source_dsa.Patterns;

public class TEST {
    /*

sss*
ss*-*
s*---*
*-----*

     */
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