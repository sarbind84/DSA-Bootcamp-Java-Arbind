package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 09-11-2022
 **/
public class Robot_Return_to_Origin {
    public static void main(String[] args) {

        String moves = "UD";

        int x = 0, y = 0;

        for (char c : moves.toCharArray()) {

            if (c == 'U') y++;
            if (c == 'D') y--;
            if (c == 'L') x--;
            if (c == 'R') x++;

        }

        System.out.println(x==0&&y==0);

    }
}
