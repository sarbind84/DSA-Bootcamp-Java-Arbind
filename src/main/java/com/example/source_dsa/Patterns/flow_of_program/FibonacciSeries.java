package com.example.source_dsa.Patterns.flow_of_program;

/**
 * @Author : ArbindSharma
 * @Date : 26-09-2022
 **/
public class FibonacciSeries {
    public static void main(String[] args) {

        int n1=0;
        int n2=1;
        int n3 = 0;
        System.out.print(n1+" ");
        System.out.print(n2);
        int till= 7;
        for (int i = 1; i < till-2; i++) {
             n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }


    }
}
