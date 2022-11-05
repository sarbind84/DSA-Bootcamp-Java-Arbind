package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 20-09-2022
 **/

class PascalTriangle {
    public static void main(String[] args) {
        int n = 7, j;
        //to print last line  use  ....--- i = 6,
        //for single element
      //  System.out.print(" " + g.factorial(2) / (g.factorial(2 - 1) * g.factorial(1)));

       for (int i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                // for left spacing
                System.out.print("");
            }
            for (j = 0; j <= i; j++) {
                // nCr formula
                System.out.print(" "+ factorial(i) / (factorial(i - j) * factorial(j)));
            }
            // for newline
            System.out.println();
        }
    }
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}

