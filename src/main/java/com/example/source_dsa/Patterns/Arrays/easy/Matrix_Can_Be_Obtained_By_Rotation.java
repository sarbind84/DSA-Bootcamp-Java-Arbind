package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 16-10-2022
 **/
public class Matrix_Can_Be_Obtained_By_Rotation {
    public static void main(String[] args) {

        int[][] mat = {{0, 1}, {1, 1}};

        int[][] target = {{1, 0}, {0, 1}};


        int[][] ints;
        boolean flag=false;

        for (int i = 0; i < 4; i++) {
            ints = rotateMatrix(mat);
            if (Arrays.deepEquals(ints,target)){
                 flag = true;
                break;
            }
            mat=ints;
        }

        System.out.println(flag);

    }

    private static int[][] rotateMatrix(int[][] matrix) {

        int row = matrix.length;
        //first find the transpose of the matrix.
        for (int i = 0; i < row; i++) {

            //traverse in only upper triangle
            for (int j = i; j < row; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse each row
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][row - 1 - j];
                matrix[i][row - 1 - j] = temp;
            }
        }

        return matrix;
    }
}
