package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 01-11-2022
 **/
public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {

        String[] word1 = {"ab", "c"};
        String[] word2 = {"ab", "c"};


        int arrindex1=0,arrindex2=0;
        int element1=0,element2=0;

        while (arrindex1<word1.length&&arrindex2<word2.length){

            if (word1[arrindex1].charAt(element1)!=word2[arrindex2].charAt(element2)){
                System.out.println(false);
            }

            element1++;
            element2++;

            if (element1==word1[arrindex1].length()){
                element1=0;
                arrindex1++;
            }

            if (element2==word2[arrindex2].length()) {
                element2 = 0;
                arrindex2++;
            }
        }


        System.out.println(arrindex1==word1.length&&arrindex2==word2.length);










        /*String join = String.join("", words);
        String join1 = String.join("", word1);

        if (join.equals(join1)){
            System.out.println("Yes equal");
        }else {
            System.out.println("Not equal");
        }*/


        //  return(String.join("", word1).equals(String.join("", word2)));




        //2nd approach

       /*     int arrindex1=0,arrindex2=0;
        int element1=0,element2=0;

        while(arrindex1<word1.length && arrindex2<word2.length){
            if(word1[arrindex1].charAt(element1) != word2[arrindex2].charAt(element2)){
                System.out.println( false);
            }
            element1++;
            element2++;

            if(element1==word1[arrindex1].length()){
                element1=0;
                arrindex1++;
            }

            if(element2==word2[arrindex2].length()){
                element2=0;
                arrindex2++;
            }
        }

        System.out.println( arrindex1==word1.length && arrindex2==word2.length);



*/




    }
}
