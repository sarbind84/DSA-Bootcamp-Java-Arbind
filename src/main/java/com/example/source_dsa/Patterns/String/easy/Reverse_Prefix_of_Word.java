package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 30-11-2022
 **/
public class Reverse_Prefix_of_Word {
    public static void main(String[] args) {

        String word = "abcdefd";
        String ch = "d";
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;

               index =  word.indexOf(ch);

      for (int i = index; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        for (int i = index; i < word.length(); i++) {
            stringBuilder.append(word.charAt(i));
        }

        String s = stringBuilder.toString();
        System.out.println(s);


    }
}
