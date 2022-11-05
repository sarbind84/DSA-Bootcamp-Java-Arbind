package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 02-11-2022
 **/
public class Number_of_Strings_That_Appear_as_Substrings_in_Word {
    public static void main(String[] args) {

        String[] pattern = {"a", "abc", "bc", "d"};
        String subString = "abc";

        int count=0;
        for (String patternWord : pattern) {
            if(subString.contains(patternWord)){
                count++;
            }
        }
        System.out.println(count);


    }
}
