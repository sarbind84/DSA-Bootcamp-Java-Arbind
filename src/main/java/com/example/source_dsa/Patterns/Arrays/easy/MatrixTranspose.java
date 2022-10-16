package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 12-10-2022
 **/
public class MatrixTranspose {
    public static void main(String[] args) {

        int[][] array = {
                {1,2,3},
                {4,5,6}
        };

//        System.out.println(array[0].length);

        int[][] Transposearray =  new int[array[0].length][array.length];

        for (int[] a:
                array) {
            System.out.println("Orginal Array = "+Arrays.toString(a));
        }

        System.out.println("-------------------------------");

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                Transposearray[i][j]=array[j][i];
            }
        }

        for (int[] a:
             Transposearray) {
            System.out.println("Transposed Array = "+Arrays.toString(a));
        }
    }
}
