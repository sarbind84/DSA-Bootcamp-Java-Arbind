package com.example.source_dsa.Patterns.Recursion.arrayQuestions;

/**
 * @Author : ArbindSharma
 * @Date : 13-02-2023
 **/
public class linearSearch {
    public static void main(String[] args) {

        int[] arrTo = new int[]{3, 2, 1, 5, 1};
        int i = linearSearch(arrTo, 7);
        System.out.println(i);

    }

    private static int linearSearch(int arr[],int toFind) {
        int index=0;
         return helper(arr, index, toFind);
    }

    private static int helper(int arr[],int index, int toFind) {
        //base condition 1 - traversed all the elements so return not found
        if (index == arr.length){
         return -1;
        }

        //base condition 2 - if found then return found index
        if (arr[index] == toFind){
            return index;
        }

        //if not found continue to look for it.
       return helper(arr,index+1,toFind);

    }
}
