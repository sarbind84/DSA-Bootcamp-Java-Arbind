package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 31-10-2022
 **/
public class Sorting_the_Sentence {
    public static void main(String[] args) {

        String s = "is2 sentence4 This1 a3";
        StringBuilder newS = new StringBuilder();

        String[] ans = new String[s.split(" ").length];

        // System.out.println(Arrays.toString(s.split(" ")));

        for (String word : s.split(" ")) {
            ans[word.charAt(word.length()-1) - '1'] = word.substring(0, word.length() - 1);
        }


        String h = String.join(" ",ans);
        System.out.println(h);




    }
}
