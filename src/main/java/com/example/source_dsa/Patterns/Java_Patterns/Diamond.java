package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 29-10-2022
 **/
public class Diamond {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i < n; i++) {
            int stars = i<=n/2 ?(2*i)-1 :2*(n-i)-1;
            int spacess = i<=n/2 ? n/2-i: (i-n/2);
            for (int spaces = 0; spaces < spacess; spaces++) {
                System.out.print("-");
            }
            System.out.print(stars);
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


       /* //easy way more complexity
        int n = 4;
        for (int i = 1; i <= n ; i++) {
            //spaces
            for (int j = 0; j < n-i; j++) {
                System.out.print("-");
            }
            int stars = (2*i)-1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("-");
            }
            int stars = (2*i)-1;
            for (int j = 1; j <= stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/

    }

}
