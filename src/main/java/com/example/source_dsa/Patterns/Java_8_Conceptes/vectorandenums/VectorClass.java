package com.example.source_dsa.Patterns.Java_8_Conceptes.vectorandenums;
import java.util.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        //The diff bt Arraylist and Vector is
        //Arraylist is not synchronized
        //but vector is synchronized
        List<Integer> list = new Vector<>();
        list.add(34);
        list.add(1);
        list.add(8);

        System.out.println(list);


    }
}
