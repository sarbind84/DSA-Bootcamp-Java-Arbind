package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 18-10-2022
 **/
public class Reshape_The_Matrix {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2}, {3, 4}};

        for (int[] h : matrix) {
            System.out.println(Arrays.toString(h));
        }

        int r = 2, initialColumn = 2;
        int[][] newArray = new int[r][initialColumn];

       /*if (matrix.length*matrix[0].length!=r*c){
           return matrix;
       }*/

        int startingColumn = 0;
        int startingRow = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (startingColumn == initialColumn) {
                    startingRow++;
                    startingColumn = 0;
                }
                newArray[startingRow][startingColumn] = matrix[i][j];
                startingColumn++;
            }
        }

        for (int[] g : newArray) {
            System.out.println(Arrays.toString(g));
        }


    }
}
