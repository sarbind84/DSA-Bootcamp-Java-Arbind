package com.example.source_dsa.Patterns.flow_of_program;

/**
 * @Author : ArbindSharma
 * @Date : 26-09-2022
 **/
public class ArmstongNumber {
    private static int checkArmstrong(int check) {
        int sum = 0;
        while (check>0){
        int r = check%10;
        sum = sum + (r*r*r);
        check = check/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1000;

        for (int i = 1; i < 1000; i++) {
            int check = i;
            int sum = checkArmstrong(check);
            if (sum == i){
                System.out.println("Your Armstrong Number is "+ i);
            }
        }

    }


}
