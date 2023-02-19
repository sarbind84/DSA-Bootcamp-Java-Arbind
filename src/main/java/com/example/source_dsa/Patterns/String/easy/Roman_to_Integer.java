package com.example.source_dsa.Patterns.String.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : ArbindSharma
 * @Date : 01-12-2022
 **/
public class Roman_to_Integer {
    public static void main(String[] args) {
        String s  = "MCMXCIV";

        Map<Character, Integer> map  = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);

        }};

        int n = s.length();
        int ans = map.get(s.charAt(n - 1));

        for (int i = n - 2; i >= 0; i--) {
            char curr = s.charAt(i);
            char next = s.charAt(i + 1);

            if (map.get(curr) < map.get(next)) {
                ans -= map.get(curr);
            }
            else ans += map.get(curr);
        }



        System.out.println(ans);




    }
}
