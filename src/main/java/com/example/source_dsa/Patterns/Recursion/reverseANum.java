package com.example.source_dsa.Patterns.Recursion;

public class reverseANum {
    public static void main(String[] args) {
        int num = 341;
        System.out.println(rev(431));
    }

    public static int rev(int x) {
        int digit = (int) (Math.log10(x) + 1);

        return helper(x, digit);
    }

    private static int helper(int n, int digit) {

        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digit - 1) + helper(n / 10, digit - 1);
    }


}
