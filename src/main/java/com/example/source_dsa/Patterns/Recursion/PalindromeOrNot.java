package com.example.source_dsa.Patterns.Recursion;

public class PalindromeOrNot {
    public static void main(String[] args) {
        System.out.println(palindrome(431));
    }

    static int rev(int n){
        int numberOfDigits = (int) (Math.log10(n) +1);
        int args =numberOfDigits-1;
        return  helperFunction(n,args);
    }

    static boolean palindrome(int n){
        return n == rev(n);
    }

    static int helperFunction(int n, int args){
        if (n%10 == n){
            return n;
        }

        return (int) (n%10 * Math.pow(10,args) + helperFunction(n/10,args-1));

    }

}
