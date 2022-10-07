package com.example.source_dsa.Patterns.Conditional_Loops;

import java.util.Scanner;

public class Takeinputtillzero {
    public static void main(String[] args) {

        int largest = 0;

        Scanner scanner = new Scanner(System.in);
        int ip=scanner.nextInt();
        while(ip!=0){
           ip =scanner.nextInt();
           if (ip>largest){
               largest=ip;
           }
        }
        System.out.println(largest);
    }
}
