package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 11-10-2022
 **/
public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] square = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        for (int[] squ : square) {
            System.out.println(Arrays.toString(squ));
        }

        System.out.println("--------------");

        int sum = 0;
        int forSecondaryIndex = 0;

        forSecondaryIndex = square.length;
        System.out.println(forSecondaryIndex);

        int toDEli = forSecondaryIndex / 2;
        int toDElj = forSecondaryIndex / 2;

        System.out.println("---------");

        for (int i = 0; i < square.length; i++) {

                sum+=square[i][i]+square[i][square.length-i-1];

        }


        if(square.length%2 != 0){
        sum = sum - square[toDEli][toDElj];
        System.out.println("Sum  =" + sum);}

    }

}

