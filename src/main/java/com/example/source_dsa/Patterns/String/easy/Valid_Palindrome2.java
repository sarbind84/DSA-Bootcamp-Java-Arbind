package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 21-11-2022
 **/
public class Valid_Palindrome2 {
    public static void main(String[] args) {

        String str = "abca";

        if (str.length() == 0 || str == null) {
            System.out.println(-1);
        }

        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
            else{
            System.out.println(ispalindrome1(str, start + 1, end) || ispalindrome1(str, start, end - 1));
            //yha pe pura function khatam ho jana chahiye if false
            break;
            }
        }
        System.out.println(true);
    }

    private static boolean ispalindrome1(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
