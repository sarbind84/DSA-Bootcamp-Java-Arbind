package com.example.source_dsa.Patterns.Arrays.easy;

public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        int evenCount = 0;

        for (int n : nums) {
            System.out.println(n);
            String s = String.valueOf(n);
            if (s.length()%2==0){
                evenCount++;
            }
        }

        System.out.println("Even count = "+evenCount);
    }
}
