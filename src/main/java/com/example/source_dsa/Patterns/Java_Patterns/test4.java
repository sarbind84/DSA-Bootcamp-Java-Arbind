package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 21-09-2022
 **/
public class test4 {
    public static void main(String[] args) {

        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("-");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) System.out.print(" * ");
                else System.out.print(" o ");
            }
            int z = 0;
            if (i==n){
                 z=i*2+1;
            }

            System.out.println();
            for (int j = 0; j < z; j++) {
                System.out.print(" *");
            }
        }


    }

}
