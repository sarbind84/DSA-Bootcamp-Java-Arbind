package com.example.source_dsa.Patterns.Recursion.normalRecursinoProgram;

public class AdditionRecursion {

    public static void main(String[] args) {
        //lifo.. stack
        System.out.println(addition(5));

    }

    private static int addition(int n) {

        //1st step base condition
        if (n==1){
            return n;
        }
        //2st step formula generation
        return n + addition(n-1);

    }
}

