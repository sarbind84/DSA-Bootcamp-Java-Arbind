package com.example.source_dsa.Patterns.interview_codedecode;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 13-04-2023
 **/
public class sortOnesAndTwos {
    public static void main(String[] args) {

    int[] binary = {0,1,2,1,0,1,2};

        System.out.println("Before swapping ="+ Arrays.toString(binary));

        /*sortColors(binary);
        System.out.println("After swapping ="+ Arrays.toString(binary));
    */

        int low = 0;
    int high = binary.length-1;
    int mid = 0;

    while(mid<=high){
        if (binary[mid] == 0){
            //when mid element is zero
            swap1(low,mid,binary);
            mid++;
            low++;
        }
        else if (binary[mid] == 1){
            //when mid element is 1
            mid++;
        }
        else {
            //when mid element is 2
            swap1(mid,high,binary);
            high--;
        }
    }

        System.out.println(Arrays.toString(binary));

    }

    private static void swap1(int low, int mid, int[] nums) {
        int temp = nums[low];
        nums[low] = nums[mid];
        nums[mid] = temp;
    }

   


}
