package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 02-11-2022
 **/
public class Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public static void main(String[] args) {

        String s = "10#11#12";

        int p1=0, p2 =2;

        int lengthOfString = s.length();

        char alphabetMap[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        String ans = "";

        if (lengthOfString < 3){
            for (char c : s.toCharArray()) {
                ans = ans + alphabetMap[c - '1'];
        }
        }

        while (p1<lengthOfString){

            if ( p2 <lengthOfString && s.charAt(p2) == '#' ){
                ans = ans + alphabetMap[Integer.parseInt(s.substring(p1,p2)) - 1];
                p1 = p1+3;
                p2 = p2+3;
            }else {
                ans = ans + alphabetMap[s.charAt(p1) - '1'];
                p1= p1 + 1;
                p2= p2+1;
            }


        }
        System.out.println(ans);




           /* int p1 = 0, p2 = 2;
            int lengthOfString = s.length();
            char alphabetMap[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            String ans = "";
            if(lengthOfString < 3){
                for(char c : s.toCharArray()){
                    ans += alphabetMap[c - '1'];
                }
            }
            while(p1 < lengthOfString){
                if(p2 < lengthOfString && s.charAt(p2) == '#'){
                    ans += alphabetMap[Integer.parseInt(s.substring(p1, p2)) - 1];
                    p1 += 3;
                    p2 += 3;
                }else{
                    ans += alphabetMap[s.charAt(p1) - '1'];
                    p1++;
                    p2++;
                }
            }

            System.out.println(ans);*/

    //}
}}
