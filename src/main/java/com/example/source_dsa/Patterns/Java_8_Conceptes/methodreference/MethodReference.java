package com.example.source_dsa.Patterns.Java_8_Conceptes.methodreference;

public class MethodReference {
    public static void main(String[] args) {

        FunctionalnterfaceDemo functionalnterfaceDemo = () -> {
            System.out.println("hello functional Interface");
        };

        functionalnterfaceDemo.display();
        functionalnterfaceDemo.display2();

    }


}
