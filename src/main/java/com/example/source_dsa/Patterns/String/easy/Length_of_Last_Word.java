package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 01-12-2022
 **/
public class Length_of_Last_Word {
    public static void main(String[] args) {

        String s = "Hello World   ";

   /*     String lastWord = s.substring(s.lastIndexOf(" ")+1);
        System.out.println(lastWord);*/

        int n = s.length();
        int count = 0;

        //resetting n value if space is presend after last word

        while(s.charAt(n-1)== ' '){
            n--;
            if (n == 0){
                System.out.println(0);
                break;
            }
        }

        while (s.charAt(n - 1) != ' ') {

            n--;
            if (n == 0){
                System.out.println(0);
                break;
            }
            count++;
        }

        System.out.println("count = "+count);


    }
}
