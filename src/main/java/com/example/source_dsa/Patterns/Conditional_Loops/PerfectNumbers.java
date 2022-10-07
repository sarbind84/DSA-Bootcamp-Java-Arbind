package com.example.source_dsa.Patterns.Conditional_Loops;

/**
 * @Author : ArbindSharma
 * @Date : 28-09-2022
 **/
public class PerfectNumbers {
    public static void main(String[] args) {
        int n = 28;
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n%i==0){
                    sum = sum + i;
            }
        }
        System.out.println("Sum ="+sum);

        if (sum == n){
            System.out.println("Yes It is a perfect Number");
        }else{
            System.out.println("No It is not a perfect number");
        }


    }
}
