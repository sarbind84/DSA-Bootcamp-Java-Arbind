package com.example.source_dsa.Patterns.Recursion;

public class FactorialRecursion {
    public static void main(String[] args) {
        //lifo.. stack
        System.out.println(factorial(5));

    }

    private static int factorial(int n) {

        //1st step base condition
        if (n==1){
            return n;
        }
        //2st step formula generation
       return n* factorial(n-1);

    }
}
