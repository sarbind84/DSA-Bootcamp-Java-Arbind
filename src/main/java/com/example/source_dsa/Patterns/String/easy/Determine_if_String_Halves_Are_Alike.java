package com.example.source_dsa.Patterns.String.easy;

import java.util.Set;

/**
 * @Author : ArbindSharma
 * @Date : 02-11-2022
 **/
public class Determine_if_String_Halves_Are_Alike {
    public static void main(String[] args) {

        int counterforsmallVowel = 0;
        int counterforbigVowel = 0;
        String s = "book";

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        System.out.println(vowels);

        for (int i = 0,j = s.length()-1; i<j; ++i, --j) {
            if (vowels.contains(s.charAt(i))){
                counterforsmallVowel++;
            }
            if (vowels.contains(s.charAt(j))){
                counterforbigVowel++;
            }
        }

        if (counterforsmallVowel==counterforbigVowel){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
