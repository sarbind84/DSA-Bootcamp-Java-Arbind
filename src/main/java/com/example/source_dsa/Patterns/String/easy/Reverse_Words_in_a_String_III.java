package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 09-11-2022
 **/
public class Reverse_Words_in_a_String_III {

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        // Approach:
        // Using two pointers, 'start' and 'end', each time 'end' reaches a space, we reverse the words before.
        // To reverse, we convert the String 's' to a char array, then write a method to reverse the char in the array.

        // Convert s into char array.
        char[] chars = s.toCharArray();

        int start = 0;
        int end;
        for (end = 0; end <= chars.length; end++) {
            // When 'end' reaches a space character ' ', reverse the words from 'start' to 'end' - 1 index in 'chars'.
            if (end == chars.length || chars[end] == ' ') {
                reverse(chars, start, end - 1);
                // reset the start for the next word.
                start = end + 1;
            }
        }

        System.out.println(new String(chars));
    }

    // A private method to reverse the char in the array using the 'start' and 'end' pointer.
    private static void reverse(char[] c, int start, int end) {
        while (start < end) {
            char tmp = c[end];
            c[end] = c[start];
            c[start] = tmp;
            start++;
            end--;
        }
    }
}
