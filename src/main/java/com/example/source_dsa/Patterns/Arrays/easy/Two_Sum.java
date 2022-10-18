package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author : ArbindSharma
 * @Date : 17-10-2022
 **/

public class Two_Sum {
    public static void main(String[] args) {

        int[] nums = {2,6,5,8,11};
        int target = 14;

        int[] result = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = target-nums[i];

            if (map.containsKey(key)){
                //this is from index i
                result[1] =i;
                //this is from hash table
                result[0] = map.get(key);
                break;
            }
        map.put(nums[i],i);
        }

        System.out.println(Arrays.toString(result));
//o(n)  is time complexity
    }
}
