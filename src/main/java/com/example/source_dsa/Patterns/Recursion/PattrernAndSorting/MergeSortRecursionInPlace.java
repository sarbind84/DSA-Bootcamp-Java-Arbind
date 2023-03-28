package com.example.source_dsa.Patterns.Recursion.PattrernAndSorting;

import java.util.Arrays;


public class MergeSortRecursionInPlace {
    public static void main(String[] args) {

        int[] arr = {8, 3, 4, 12, 5, 6};
        mergeSortTillOneElementInPlace(arr,0,arr.length);
        //changing in original array so just print it
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortTillOneElementInPlace(int[] arr, int start, int end) {

        if ((end - start) == 1) {
            return;
        }

        int mid = (start+end) / 2;

        //this is only calling till 1 element.
        mergeSortTillOneElementInPlace(arr, start, mid);
        mergeSortTillOneElementInPlace(arr, mid, end);

        //this is actual return of function call
        mergeInPlace(arr,start, mid ,end);

    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end-start];

        int i = start;
        int j = mid;
        int k = 0;


        //same logic as above, comparing and shifting pointers..
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }


        //finding remaining element from first and adding it to initial array..
        while (i < mid) {
            mix[k] = arr[i];
            k++;
            i++;
        }

        //finding remaining element from second and adding it to initial array..
        while (j < end) {
            mix[k] = arr[j];
            k++;
            j++;
        }

        //yha mix tak bhar gya all the elements..so running loop till mix length
        //and then it's adding the elements to correct place..
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }


    }

}

