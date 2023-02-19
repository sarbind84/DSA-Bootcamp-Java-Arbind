package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 30-11-2022
 **/
public class Check_if_Binary_String_Has_at_Most_One_Segment_of_Ones {
    public static void main(String[] args) {

        String s = "11011";



        String tocheck = "11";

            if("1".equals(s)&&s.length()<1){


        int slen = s.length();
        int tochecklen = tocheck.length();

        int max = 0;


        int cnt = 0;
        for (int i = 0; i < slen; i++) {

            int k = 0;
            for (int j = i; j < slen; j++) {
                if (s.charAt(j) == tocheck.charAt(k))
                    k++;
                else
                    break;

                if (k == tochecklen) {
                    k = 0;
                    cnt++;
                }
            }


        }
        System.out.println(cnt);


    }}
}
