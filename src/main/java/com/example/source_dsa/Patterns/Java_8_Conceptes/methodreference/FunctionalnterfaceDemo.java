package com.example.source_dsa.Patterns.Java_8_Conceptes.methodreference;

public interface FunctionalnterfaceDemo {
    void display();
    default void display2(){
        System.out.println("this is default method");
    }
}
