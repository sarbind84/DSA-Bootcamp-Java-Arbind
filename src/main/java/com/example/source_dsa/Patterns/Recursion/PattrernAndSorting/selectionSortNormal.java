package com.example.source_dsa.Patterns.Recursion.PattrernAndSorting;

import java.util.Arrays;

public class selectionSortNormal {
    public static void main(String[] args) {




       /* //FIRST ME REPLACE KRNA
        for (int i = 0; i < arr.length; i++) {
            //lets assume first element is min element
            int minIndex = i;


            //linear search se find min element and then swap with first element
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            //first se loop chal rha hai to min first me rakh do
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i] = temp;
        }*/


        int[] arr = {4, 3, 7, 1};
        //LAST ME REPLACE KRNA
        int arrlen = arr.length-1;

        for (int i = arrlen; i >= 0; i--) {
            System.out.println("first loop runned for I value = " +i + "");
            //lets assume first element is max element
            int maxIndex = i;
            //linear search se find max element and then swap with last element
            //=0 to last element bhi consider ho
            for (int j = i-1; j >= 0; j--) {
                if (arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            System.out.println("Max Index = "+maxIndex);

            //first se loop chal rha hai to max last me rakh do
            int temp = arr[maxIndex];
            arr[maxIndex]=arr[i];
            arr[i] = temp;
            System.out.println("Array after 1st swap  = " + Arrays.toString(arr));
        }


        System.out.println(Arrays.toString(arr));


    }
}
