package com.example.source_dsa.Patterns.flow_of_program;

/**
 * @Author : ArbindSharma
 * @Date : 25-09-2022
 **/
public class MultiplicationTable {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Multiplication Table of "+n+" is =");
        for (int i = 1; i < 13; i++) {
            System.out.println(n+" * "+ i +" = "+n * i);
        }
    }

}
