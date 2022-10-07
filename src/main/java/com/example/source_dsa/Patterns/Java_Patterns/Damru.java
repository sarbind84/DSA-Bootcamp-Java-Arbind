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
public class Damru {
    public static void main(String[] args) {
        int n=4;
        //for spaces
        for (int i = 0; i <= 2*n; i++) {

            //after n print one line extra according to requirement
            int spaces = i>n?n-(i-n):i;
            if (spaces == n){
                for (int j = 0; j < spaces; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                System.out.println();
            }

            //for printing spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print("-");
            }


            //for printing stars
            int c = i>n ? i-n:n-i;
            for (int j = 0; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
