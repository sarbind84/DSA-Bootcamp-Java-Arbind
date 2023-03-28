package com.example.source_dsa.Patterns.Recursion.PattrernAndSorting;

import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {

        int[] arr = {8, 3, 4, 12, 5, 6};
        System.out.println(Arrays.toString(mergeSortTillOneElement(arr)));
    }

    private static int[] mergeSortTillOneElement(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }


        int end = arr.length;
        int mid = arr.length / 2;

        //this is only calling till 1 element.
        int[] left = mergeSortTillOneElement(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSortTillOneElement(Arrays.copyOfRange(arr, mid, end));

        //this is actual return of function call..
        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;


        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }


        //finding remaining element from first and adding it to initial array
        while (i < first.length) {
            mix[k] = first[i];
            k++;
            i++;
        }

        //finding remaining element from second and adding it to initial array
        while (j < second.length) {
            mix[k] = second[j];
            k++;
            j++;
        }



        return mix;


    }


}
