package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 01-11-2022
 **/

public class To_Lower_Case {
    public static void main(String[] args) {
//ASCII VALUE for upper case is 65 to 70 i.e., A to Z
//ASCII VALUE for lower case is 96 to 122 i.e., a to z

        String str = "Hello";
        char[] a = str.toCharArray();

        char[]  a1 = str.toCharArray();

       /* //for converting in small or lowercase letters
        for (int i = 0; i < a1.length; i++) {
            if ('A' <= a1[i] && a1[i] <= 'Z'){
                a1[i] = (char) (a[i]+32);
            }
        }*/


        //for converting in uppercase letters
        for (int i = 0; i < a1.length; i++) {
            if ('a'<=a1[i]&&a1[i]<='z'){
                a1[i] = (char) (a[i]-32);
            }
        }

        System.out.println(new String(a1));


    }
}
