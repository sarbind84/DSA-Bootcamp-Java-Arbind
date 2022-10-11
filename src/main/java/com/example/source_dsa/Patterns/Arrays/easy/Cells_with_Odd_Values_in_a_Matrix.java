package com.example.source_dsa.Patterns.Arrays.easy;

/**
 * @Author : ArbindSharma
 * @Date : 11-10-2022
 **/
public class Cells_with_Odd_Values_in_a_Matrix {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] operationOn;

        operationOn = new int[][]{{0, 0, 0}, {0, 0, 0}};

        System.out.println("---------------");


        int[][] indices = {{0, 1}, {1, 1}};

//        main work

        boolean[] oddRows = new boolean[n], oddCols = new boolean[m];
        int cntRow = 0, cntCol = 0;
        for (int[] idx : indices) {
            //true means it is odd element in the n*m array...
            oddRows[idx[0]] = !oddRows[idx[0]];
            oddCols[idx[1]] = !oddCols[idx[1]];
        }
        for (boolean r : oddRows)
            cntRow += r ? 1 : 0;
        for (boolean c : oddCols)
            cntCol += c ? 1 : 0;
        // return m * cntRow + n * cntCol - 2 * cntRow * cntCol;
        //  return (m - cntCol) * cntRow + (n - cntRow) * cntCol;
        System.out.println(m * cntRow + n * cntCol - 2 * cntRow * cntCol);


    }
}
