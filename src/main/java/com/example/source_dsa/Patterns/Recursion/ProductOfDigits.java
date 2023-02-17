package com.example.source_dsa.Patterns.Recursion;

public class ProductOfDigits {

    public static void main(String[] args) {


        System.out.println(getSumOfDigits(25));

    }


    static int getSumOfDigits(int n) {
        //base condition
        if(n%10 == n){
            return n;
        }

        //formula
        return n % 10 * getSumOfDigits(n / 10);

    }

}
