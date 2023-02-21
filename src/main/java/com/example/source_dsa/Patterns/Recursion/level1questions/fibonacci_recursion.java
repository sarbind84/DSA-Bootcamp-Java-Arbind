package com.example.source_dsa.Patterns.Recursion.level1questions;

/**
 * @Author : ArbindSharma
 * @Date : 17-01-2023
 **/
 class fibonacci_recursion {
        public int fib(int n) {

            if(n==0||n==1){
                return n;
            }

            int num = F(n);
            return num;

        }

        public static int  F(int n){

            int n1 = 0;
            int n2 = 1;
            int n3 = 0;

            while( n>=2){

                n3 = n1 + n2;

                n1=n2;
                n2=n3;
                n--;
            }


            return n3;

        }
    }


