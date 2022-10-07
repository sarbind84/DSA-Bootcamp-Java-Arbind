package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 21-09-2022
 **/

        /*

        *
        **
        ***
        ****
        ***
        **
        *

*/
public class test3 {
    public static void main(String[] args) {
        int n=4;

        for (int i = 0; i < 2*n; i++) {
            //if row>n then n - row -n or print row times column
            if (i==4){

                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            int c = i>n?n-(i-n):i;

            for (int j = 0; j < c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
