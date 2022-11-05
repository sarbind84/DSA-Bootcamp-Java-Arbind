package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 21-09-2022
 **/

/*

* * * *
-* * *
--* *
---*
---*
--* *
-* * *
* * * *

 */
public class Damru {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 2 * n; i++) {
            int sideSpaces = i > n ? n - (i - n) + 1 : i;
            for (int j = 1; j < sideSpaces; j++) {
                System.out.print("-");
            }
            //i-n for below part it will print 1 2 and 3 stars..
            int spaces = i <= n ? n - i + 1 : i - n;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
