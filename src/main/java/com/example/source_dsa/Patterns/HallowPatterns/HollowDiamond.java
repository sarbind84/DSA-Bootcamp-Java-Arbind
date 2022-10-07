package com.example.source_dsa.Patterns.HallowPatterns;

public class HollowDiamond
{
    public static void main(String args[])
    {

        int rows=4;

     /*   for(int i=1; i<=rows; i++)
        {
            for(int j=rows; j>i; j--)
            {
//prints space        
                System.out.print("-");
            }
//prints symbol  
            System.out.print("*");
            for(int j=1; j<(i-1)*2; j++)
            {
//prints space      
                System.out.print("?");
            }
            if(i==1)
            {
//throws cursor to the next line      
                System.out.print("\n");
            }
            else
            {
//prints symbol and throws cursor to the next line          
                System.out.print("*"+"\n");
            }
        }*/
//prints lower section of the pattern
        for(int i=rows-1; i>=1; i--)
        {
            for(int j=rows; j>i; j--)
            {
//prints space          
                System.out.print("-");
            }
//prints symbol  
            System.out.print("*");
            for(int j=1; j<(i-1)*2; j++)
            {
//prints space      
                System.out.print("?");
            }
            if(i==1)
            {
//throws cursor to the next line          
                System.out.print("\n");
            }
            else
            {
//prints symbol and throws cursor to the next line       
                System.out.print("*"+"\n");
            }
        }
    }
}  