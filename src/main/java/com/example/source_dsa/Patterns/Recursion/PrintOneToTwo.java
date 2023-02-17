package com.example.source_dsa.Patterns.Recursion;

public class PrintOneToTwo {
    public static void main(String[] args) {
        //lifo.. stack
        fun(5);
    }

    private static void fun(int n) {

        if (n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);

    }
}
