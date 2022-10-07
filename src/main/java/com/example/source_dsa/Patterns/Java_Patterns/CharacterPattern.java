package com.example.source_dsa.Patterns.Java_Patterns;

/**
 * @Author : ArbindSharma
 * @Date : 23-09-2022
 **/
public class CharacterPattern
{
    public static void main(String[] args)
    {
        int alphabet = 65;

        System.out.println("** Printing the pattern... **");
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print( (char) (alphabet+j) + " ");
            }
            System.out.println();
        }
    }
}