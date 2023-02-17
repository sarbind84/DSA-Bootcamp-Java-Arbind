package com.example.source_dsa.Patterns.Recursion;

public class CountNumberOfZeros {

    public static void main(String[] args) {

        System.out.println(countNumberOfZeros(10203));

    }
    static int countNumberOfZeros(int n){
        int count =0;
        return helper(n,count);
    }

     static int helper(int n, int count) {
//base condition
        if (n%10 ==n){
            return count;
        }


//formula
        if (n%10==0){
            return helper(n/10,count+1);
        }else {
            return helper(n/10,count);
        }


    }


}
