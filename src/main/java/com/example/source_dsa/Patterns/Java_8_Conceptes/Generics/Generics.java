package com.example.source_dsa.Patterns.Java_8_Conceptes.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : ArbindSharma
 * @Date : 14-04-2023
 **/
public class Generics {

    public static void main(String[] args) {

    Box<String> box = new Box<>("Square");
    Box<Integer> boxint = new Box<>(23);

        System.out.println(box.getValue());
        System.out.println(boxint.getValue());

        String name = box.type.getClass().getName();
        System.out.println(name);


        String name1 = boxint.type.getClass().getName();
        System.out.println(name1);

        box.performtask();


    }
}
