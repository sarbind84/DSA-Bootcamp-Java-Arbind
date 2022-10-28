package com.example.source_dsa.Patterns.Java_Patterns;

import java.util.Scanner;

/**
 * @Author : ArbindSharma
 * @Date : 21-09-2022
 **/
   /*

sss*
ss*-*
s*---*
*-----*

     */
public class test5 {
    public static void main(String[] args) {
//shortest code for the output...

        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("s");
            }

            int stars = (2 * i) - 1;

            for (int j = 0; j < stars; j++) {
                if (j == 0 || j == stars - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }






     /*

        Scanner scan = new Scanner(System.in);
        //System.out.print("Enter the number of rows: ");
//reads an integer (rows) from the user
        int rows = 4;
        // System.out.print("Enter the symbol you want to print: ");
//reads the symbol from the user
        char symbol = '*';
//prints upper section of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
//prints space
                System.out.print("s");
            }
//prints symbol
            System.out.print(symbol);
            for (int j = 1; j < (i - 1) * 2; j++) {
//prints space
                System.out.print("-");
            }
            if (i == 1) {
//throws cursor to the next line
                System.out.print("\n");
            } else {
//prints symbol and throws cursor to the next line
                System.out.print(symbol + "\n");
            }
        }

        */



        /*
//prints lower section of the pattern
        for(int i=rows-1; i>=1; i--)
        {
            for(int j=rows; j>i; j--)
            {
//prints space
                System.out.print("b");
            }
//prints symbol
            System.out.print(symbol);
            for(int j=1; j<(i-1)*2; j++)
            {
//prints space
                System.out.print("-");
            }
            if(i==1)
            {
//throws cursor to the next line
                System.out.print("\n");
            }
            else
            {
//prints symbol and throws cursor to the next line
                System.out.print(symbol+"\n");
            }
        }*/
    }
}
