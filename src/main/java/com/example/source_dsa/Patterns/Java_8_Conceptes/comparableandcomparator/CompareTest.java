package com.example.source_dsa.Patterns.Java_8_Conceptes.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author : ArbindSharma
 * @Date : 11-04-2023
 **/
public class CompareTest implements Comparable<CompareTest> {

    int id;
    String name;

    String class1;



    public CompareTest(int id, String name, String class1) {
        this.id = id;
        this.name = name;
        this.class1 = class1;
    }

    public static void main(String[] args) {

        ArrayList<CompareTest> compareTests = new ArrayList<>();
        compareTests.add(new CompareTest(12, "arbind11", "class1"));
        compareTests.add(new CompareTest(2, "zrbind20", "class2"));
        compareTests.add(new CompareTest(34, "hrbind3", "class3"));
        compareTests.add(new CompareTest(4, "brbind1", "class14"));

        Collections.sort(compareTests);

        for (CompareTest e :
                compareTests) {
            System.out.println(e.getName());
//            S/*ystem.out.println(e.getClass1());
//            System.out.println(e.getName());*/
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    @Override
    public int compareTo(CompareTest o) {
        return this.getName().compareTo(o.getName());
    }


}

















