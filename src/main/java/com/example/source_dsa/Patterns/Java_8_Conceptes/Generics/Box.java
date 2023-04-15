package com.example.source_dsa.Patterns.Java_8_Conceptes.Generics;

/**
 * @Author : ArbindSharma
 * @Date : 14-04-2023
 **/
public class Box<T>{
    T type;

    public void performtask(){
        //instance of finds variable type
        if (type instanceof String){
            System.out.println("this is a string");
        }
    }

    public Object getValue(){
        return this.type;
    }

    public Box(T type) {
        this.type = type;
    }



}
