package com.example.source_dsa.Patterns.Java_8_Conceptes.comparableandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author : ArbindSharma
 * @Date : 11-04-2023
 **/
public class ComparatorTest {

    String name;
    String classna;
    int rollnol;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassna() {
        return classna;
    }

    public void setClassna(String classna) {
        this.classna = classna;
    }

    public int getRollnol() {
        return rollnol;
    }

    public void setRollnol(int rollnol) {
        this.rollnol = rollnol;
    }

    public ComparatorTest(String name, String classna, int rollnol) {
        this.name = name;
        this.classna = classna;
        this.rollnol = rollnol;
    }

    public static void main(String[] args) {
        ArrayList<ComparatorTest> compareTests = new ArrayList<>();
        compareTests.add(new ComparatorTest("arbind","12", 10));
        compareTests.add(new ComparatorTest("zig","1", 2));
        compareTests.add(new ComparatorTest("rahul","0", 3));
        compareTests.add(new ComparatorTest("boo","4", 4));

//        Collections.sort(compareTests, Comparator.comparing(ComparatorTest::getName));
        compareTests.sort((o1, o2) -> {
            if (o1.getRollnol() < o2.getRollnol()) {

                return o1.getRollnol() - (o2.getRollnol());
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (ComparatorTest e:
             compareTests) {
            System.out.println(e.getName());
        }



    }

}













