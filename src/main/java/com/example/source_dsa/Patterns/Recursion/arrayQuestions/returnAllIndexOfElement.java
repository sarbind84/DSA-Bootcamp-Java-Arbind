package com.example.source_dsa.Patterns.Recursion.arrayQuestions;

import java.util.ArrayList;

/**
 * @Author : ArbindSharma
 * @Date : 13-02-2023
 **/
public class returnAllIndexOfElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        int findElement = 5;

        int[] arrElements = new int[]{3, 2, 5, 5, 7};
        ArrayList<Integer> integers = allIndex(arrElements, index, findElement, list);
        System.out.println(integers);

    }

    //ya bhar lelo arraylist and then add 
    private static ArrayList<Integer> allIndex(int[] arr, int index, int findElement, ArrayList<Integer> list) {

        //base conditions
        //if reached last end of the arr, then return list.
        if (index == arr.length) {
            return list;
        }
        //if found element then add to list.

        if (arr[index] == findElement){
            list.add(index);
        }

        //other wise add next function to recursion call.
        return allIndex(arr, index+1,5,list) ;

    }
}
