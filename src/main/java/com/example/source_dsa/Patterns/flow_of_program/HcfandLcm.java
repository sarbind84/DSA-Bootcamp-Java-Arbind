package com.example.source_dsa.Patterns.flow_of_program;

public class HcfandLcm {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 35;

int on1 = n1;
int on2 = n2;
/*
//brute force approach
        for (int i = n2; i > 1; i--) {
            if (n1%i==0&&n2%i==0)
            {
                gcd= i;
            }
        }
        int lcm = n1*n2/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
        */

        //Division method
        while (n1%n2!=0){
            int rem = n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd = n2;

        int lcm = on1*on2/gcd;

        System.out.println(gcd);
        System.out.println(lcm);


    }
}
