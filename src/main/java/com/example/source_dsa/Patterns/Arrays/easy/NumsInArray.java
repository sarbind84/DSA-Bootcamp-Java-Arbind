package com.example.source_dsa.Patterns.Arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author : ArbindSharma
 * @Date : 12-10-2022
 **/
public class NumsInArray {
    public static void main(String[] args) {

        int[] num = {2,7,4};
        int addThis = 181;

//basically addThis ki value se khale hai...

     /*   List<Integer> res = new ArrayList<>();

        int i = num.length;
        while(--i >= 0 || addThis > 0) {
            if(i >= 0)
                addThis += num[i];

            res.add(addThis % 10);
            addThis /= 10;
        }
        Collections.reverse(res);

        System.out.println(res);*/

        List<Integer> res = new ArrayList<>();

        int i = num.length;

        while (--i>=0 || addThis>0){

            if (i>=0){
                addThis = addThis+num[i];
            }


            res.add(addThis%10);
            addThis = addThis/10;

        }
        Collections.reverse(res);

        System.out.println(res);

    }
}
