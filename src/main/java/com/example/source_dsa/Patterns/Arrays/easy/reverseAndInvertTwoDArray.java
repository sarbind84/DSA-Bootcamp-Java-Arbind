package com.example.source_dsa.Patterns.Arrays.easy;
import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 10-10-2022
 **/
public class reverseAndInvertTwoDArray {
    public static void main(String[] args) {


        int[][] A = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        System.out.println("Array length = "+A.length+"\n");


        for (int i = 0; i < A.length; i++) {

            //defining 2 pointers
         int start = 0;
         int end = A[i].length-1;


         //if diff is first and last element then it stays same and only middle element is changed while
            //if first and last element is same then all the element is changed.....
         while(start<=end){

             if (A[i][start]==A[i][end]){
                A[i][start] = 1-A[i][start];
                A[i][end]=A[i][start];
             }
             start++;
             end--;
         }

        }
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.println(Arrays.toString(A[i]));
        }
    }
}

