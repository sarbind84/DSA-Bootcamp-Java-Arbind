package com.example.source_dsa.Patterns;

public class TEST {
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
                if (j==1||j==stars) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }



    }
}