package com.example.source_dsa.Patterns.Recursion.PatternQuestions;

public class Triangle1 {
    public static void main(String[] args) {

        //triangle(4, 0);
        normalTriangle(3, 0);

    }

    private static void normalTriangle(int rows, int column) {
        //base condition
        if (rows==0) {
            return;
        }

        //operations
        if (column<rows){
            normalTriangle(rows,column+1);
            System.out.print("*");

        }else {
            normalTriangle(rows - 1, 0);
            System.out.println("-");

        }
    }

    private static void triangle(int rows, int column) {
        //base condition
        if (rows==0) {
            return;
        }

        //operations
        if (column<rows){
            System.out.print("*");
            triangle(rows,column+1);

        }else {
            System.out.println();
            triangle(rows - 1, 0);
        }
    }



}
