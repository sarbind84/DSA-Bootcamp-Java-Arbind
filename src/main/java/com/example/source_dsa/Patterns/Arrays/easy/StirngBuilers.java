package com.example.source_dsa.Patterns.Arrays.easy;

/**
 * @Author : ArbindSharma
 * @Date : 20-10-2022
 **/
public class StirngBuilers {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            stringBuilder.append(ch);
        }

        //doing operations on same object..
        System.out.println(stringBuilder);

    }
}
