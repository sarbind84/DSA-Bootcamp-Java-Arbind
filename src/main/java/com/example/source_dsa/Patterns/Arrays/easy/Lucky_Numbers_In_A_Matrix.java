package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : ArbindSharma
 * @Date : 18-10-2022
 **/
public class Lucky_Numbers_In_A_Matrix {
    public static void main(String[] args) {


        int[][] matrix = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };

        List<Integer > listArr = new ArrayList<>();
        int size = matrix.length;
        for (int i = 0; i < size; i++) {

            int min = 999999, minIndex  =0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]<min){
                    min = matrix[i][j];
                    minIndex=j;
                }
            }

            boolean isTrue=true;

            for (int j = 0; j < matrix.length; j++) {
               if(matrix[i][minIndex]<matrix[j][minIndex]){
                   isTrue=false;
               }
            }
            if (isTrue){

                listArr.add(matrix[i][minIndex]);
            }
        }

        System.out.println(listArr.get(0));




    }
}
