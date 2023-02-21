package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 30-11-2022
 **/
public class  Merge_Strings_Alternately {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        int i = 0;int j =0;
        int word1len = word1.length();
        int word2len = word2.length();
        char[] ch = new char[word1len+word2len];
        while (i<word1len&&j<word2len){
            ch[i+j]=word1.charAt(i++);
            ch[i+j]=word2.charAt(j++);
        }
        while (i<word1len){
            ch[i+j] = word1.charAt(i++);
        }
        while (j<word2len){
            ch[i+j] = word2.charAt(j++);
        }
        System.out.println(new String(ch));
    }
}
