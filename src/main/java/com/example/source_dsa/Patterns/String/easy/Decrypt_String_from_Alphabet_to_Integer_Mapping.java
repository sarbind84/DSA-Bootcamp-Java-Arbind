package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 02-11-2022
 **/
public class Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public static void main(String[] args) {

        String str = "10#11#12";



        StringBuilder sb = new StringBuilder();
        //Start traversal from end of the string as it will easy to
        //figure out whether this is a Type1 ('1' to '9') code or
        //Type2 ('10#' to '26#') code. # character is the key here.
        for (int i = str.length() - 1; i >= 0; ) {
            int encodedDigit = str.charAt(i) - '0';
            int shift;
            if (encodedDigit >= 1 && encodedDigit <= 9) {
                shift = 1;
            } else { // When # is encountered then calculate encoded number
                encodedDigit = (str.charAt(i - 2) - '0') * 10 + (str.charAt(i - 1) - '0');
                shift = 3;
            }
            sb.append((char) ('a' + encodedDigit - 1));
            i -= shift;
        }
        System.out.println(sb.reverse().toString()); // Reverse the string when string is decoded.
    }
}
