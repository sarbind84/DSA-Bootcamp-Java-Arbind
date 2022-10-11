package com.example.source_dsa.Patterns.Arrays.easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author : ArbindSharma
 * @Date : 07-10-2022
 **/
public class __TargetArrayInGivenOrder {
    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4};
        int[] resultNums = new int[nums.length];
        int[] index = {0,1,2,2,1};



        List<Integer> arraylist = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            arraylist.add(index[i],nums[i]);

        }
        System.out.println("Array list ="+arraylist.size());

        for (int i = 0; i < resultNums.length; i++) {
            resultNums[i]=arraylist.get(i);
        }

        System.out.println(Arrays.toString(resultNums));



    }
}
