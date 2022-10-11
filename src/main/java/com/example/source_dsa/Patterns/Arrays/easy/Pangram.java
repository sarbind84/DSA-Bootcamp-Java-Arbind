package com.example.source_dsa.Patterns.Arrays.easy;

/**
 * @Author : ArbindSharma
 * @Date : 07-10-2022
 **/
public class Pangram {
    public static void main(String[] args) {

        String s = "thequickbrownfoxjumpsoverthelazydog";
        boolean check = false;
        boolean flag = false;
        for (Character ch = 'a'; ch <= 'z'; ch++) {
            check = checkPangram(ch, s);
            if (!check) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }

       // System.out.println(flag);

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static boolean checkPangram(Character ch, String s) {

        for (char c : s.toCharArray()) {
            if (c == ch){
                return true;
            }
        }
        return false;

    }
}
