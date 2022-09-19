package com.example.source_dsa.Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 16-09-2022
 **/

     /*   ----1
        ---212
        --32123
        -4321234*/
//Patterns
//keeping track of outer loop if it's opposing in nature use counter,
public class test {
    public static void main(String[] args) {
        int n = 4;
        int counter = 0;


        for (int i = n; i >= 1; i--) {
            counter++;
            for (int j = i; j >= 1; j--) {
                System.out.print("-");
            }
            for (int j = counter; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= counter; j++) {
                System.out.print(j);
            }
            System.out.println();


        }


      /*  int counter = 0;
        for (int i = n; i >= 1; i--) {
            counter++;
            //number of stars
            for (int c = 0; c <= n - i; c++) {

                System.out.print(counter);
            }
            System.out.println();
        }
*/


    }
}
