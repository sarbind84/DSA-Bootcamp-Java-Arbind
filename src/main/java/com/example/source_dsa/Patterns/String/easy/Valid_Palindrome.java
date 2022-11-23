package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 21-11-2022
 **/
public class Valid_Palindrome {
    public static void main(String[] args) {

       /* String s = "A man, a plan, a canal: Panama";

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println(s);
        System.out.println(isPalimdrome.ispalindrome(s));*/
        String s = "abca";
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        isPalimdrom(s);

    }

    private static void isPalimdrom(String s) {

        int counter = 0;

        if (s.length()==0||s==null){
            System.out.println(false);
        }
        int start = 0,end = s.length()-1;

        while (start<end){
            if (s.charAt(start)!=s.charAt(end)){
                counter++;
                if (counter==1){
                    System.out.println("first encounter");
                    continue;
                }else {
                    System.out.println("here false"+false);
                    break;
                }
            }else {
                start++;
                end--;
            }
            if (start+1==end-1){
                System.out.println(true);
            }
        }




    }
}
