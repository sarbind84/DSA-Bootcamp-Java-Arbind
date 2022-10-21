package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 20-10-2022
 **/
public class isPalimdrome {

    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(ispalindrome(str));


    }

    static boolean ispalindrome(String str) {

        if (str.length() == 0 || str == null) {
            return true;
        }

        str = str.toLowerCase();

        int start = 0;
        int end = str.length() -1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
