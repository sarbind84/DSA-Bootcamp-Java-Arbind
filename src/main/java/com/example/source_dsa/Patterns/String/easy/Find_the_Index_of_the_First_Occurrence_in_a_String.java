package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 10-11-2022
 **/
public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int i = strStr(haystack, needle);
        System.out.println(i);

    }
    public static int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
        int heyStackLength = haystack.length();
        int needleLength = needle.length();

        if(heyStackLength < needleLength) {return -1;}

        for(int i = 0; i <= heyStackLength-needleLength; i++) {
            int j;
            for(j = 0; j < needleLength; j++) {
                //3 , 3 words krke check kre hai
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
            }

            //agar tino mil gye then return i index i.e., first i mean
            if(j == needleLength) {
                return i;
            }


        }
        return -1;
    }
}
