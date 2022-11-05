package com.example.source_dsa.Patterns.String.easy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author : ArbindSharma
 * @Date : 03-11-2022
 **/
public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {

        String longestSubString = null;
        Integer longestSubStringLength = 0;
        String s = "java";
        char[] arr = s.toCharArray();
        //LinkedHashMap to maintain the order of insertion..
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (!map.containsKey(ch)){
                map.put(ch,i);
            }else {
                i=map.get(ch);
                map.clear();
            }
            if (map.size()>longestSubStringLength){
                longestSubStringLength=map.size();
                longestSubString = map.keySet().toString();
            }
        }

        System.out.println(longestSubStringLength);
        System.out.println(longestSubString);

    }
}
