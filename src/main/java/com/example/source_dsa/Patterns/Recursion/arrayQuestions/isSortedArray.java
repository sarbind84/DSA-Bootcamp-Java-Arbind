package com.example.source_dsa.Patterns.Recursion.arrayQuestions;

/**
 * @Author : ArbindSharma
 * @Date : 13-02-2023
 **/
public class isSortedArray {
    public static void main(String[] args) {

        int[] arrCheck = new int[]{1,16,9};
        int index = 0;
        boolean sortedArrayOrNot = isSortedArrayOrNot(arrCheck, index);
        System.out.println(sortedArrayOrNot);

    }

    private static boolean isSortedArrayOrNot(int[] arr,int index) {
        if (index >= arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && isSortedArrayOrNot(arr,index+1);

    }
}
