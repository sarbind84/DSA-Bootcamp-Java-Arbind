package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 20-09-2022
 **/
public class Palindrome {
    public static void main(String[] args) {
        // kamak

      /*  String key = "121";
        String reverseKey = "";
        System.out.println(key.length());
        for (int i = key.length()-1; i >=0 ; i--) {
            reverseKey= reverseKey+key.charAt(i);
        }
        System.out.println(key);
        System.out.println(reverseKey);

        if(key.equals(reverseKey)){
            System.out.println("match found");
        }
        else System.out.println("match not found");*/

        int key = 121;

        int temp = key;
        int rem;
        int reverse = 0;

        while (key > 0) {
            rem = key % 10;
            reverse =  rem + (reverse * 10);
            System.out.println(reverse);
            key = key / 10;
        }

        System.out.println(reverse);

    }
}
