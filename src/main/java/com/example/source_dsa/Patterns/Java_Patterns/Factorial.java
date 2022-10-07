package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 20-09-2022
 **/
public class Factorial {
    public static void main(String[] args) {
        //what is factorial =
        // 5! = 5*4*3*2*1..= 120

        int n = 4;
        int sum = 1;

       for (int i = n; i >= 1; i--) {

            System.out.println("New sum value is = " + sum + " *  Ith value is = " + i);
            sum = sum * i;
            System.out.println("Resultant sum = " + sum);
            System.out.println();
        }
        System.out.println("final sum = " + sum);
        //System.out.println(fact(5));
    }

   /* static int fact(int n) {
       if (n <= 1)
            return 1;
        else return n * fact(n - 1);
    }*/


}
