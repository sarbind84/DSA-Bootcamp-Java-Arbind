package com.example.source_dsa.Patterns.Recursion;

public class TestRecursion1 {
    public static void main(String[] args) {
        //lifo.. stack
        fun(5);
    }

    private static void fun(int n) {
        if(n==0){
            return;
        }
      //  System.out.println("Before Stack "+ "f(" +n +")");
        fun(n-1);
        System.out.println("After Stack calls removed out of stack"+n);
    }
}
