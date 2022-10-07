package com.example.source_dsa.Patterns.flow_of_program;

import java.time.Year;
import java.util.Scanner;

public class Leap_Year_Or_Not {
    public static void main(String[] args) {


        int year = 1998;
        boolean yesornot = false;

        if (year % 4 == 0) {
            yesornot = true;
            //if it's ending with 00
            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    yesornot = true;
                }else {
                    yesornot=false;
                }
            }
        }
        else {
            yesornot = false;
        }

        if (yesornot) System.out.println(year+" Yes, It is a leap year");
        else System.out.println(year+" No, It is not a leap year");


    }

}
