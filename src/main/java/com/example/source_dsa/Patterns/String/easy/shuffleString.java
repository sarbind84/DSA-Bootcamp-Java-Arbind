package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 20-10-2022
 **/
public class shuffleString {
    public static void main(String[] args) {

        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        int global = 0;

        String s = "codeleet";

        char[] temp = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            temp[indices[i]] = s.charAt(i);
        }
        System.out.println(new String(temp));




      /*  String t  = "" ;
        StringBuilder stringBuilder = new StringBuilder();



            for (int i = 0; i < indices.length; i++) {
                stringBuilder.append(s.charAt(indices[i]));
                System.out.print(stringBuilder);
            }

        System.out.println(stringBuilder);*/

    }
}
