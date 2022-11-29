package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 02-11-2022
 **/
public class Number_of_Strings_That_Appear_as_Substrings_in_Word {
    public static void main(String[] args) {

        String[] pattern = {"a", "a", "a"};
        String subString = "ab";

        /*int count=0;
        for (String patternWord : pattern) {
            if(subString.contains(patternWord)){
                count++;
            }
        }
        System.out.println(count);*/

        String mainString = "hello how are you hello";
        String subString1 = "hello";
        int count = 0;

        for (String p : pattern) {
            if (findsubstring(subString, p)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean findsubstring(String mainString, String subString) {
        for (int i = 0; i < mainString.length(); i++) {
            int j;
            for (j = 0; j < subString.length(); j++) {
                if (mainString.charAt(i + j) != subString.charAt(j)) {
                    break;
                }
            }
            if (j == subString.length()) {
//                System.out.println("Found at Index = " + i);
                return true;
            }
        }
        return false;
    }
}
