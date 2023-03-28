package com.example.source_dsa.Patterns.Java_8_Conceptes.vectorandenums;

import java.util.ArrayList;
import java.util.Arrays;

public class EnumClass implements Comparable<EnumClass>{

    @Override
    public int compareTo(EnumClass o) {
        EnumName e = EnumName.GREEN;
        EnumName e1 = EnumName.RED;
        return e.compareTo(e1);
    }

    enum EnumName {
        RED,GREEN, YELLOW;

        EnumName(){
            System.out.println("Values is = "+this.name());
        }

    }



    public static void main(String[] args){

        //enum is not public or protected, only private or default.
        //why? cuz we dont't want to create new objects
        //this is not enum concept, that's why..
        //can't extends or superclass
        //can implement class
        //abstact methods is not allowed,have to define mthos
        //
        EnumName valueof;
        valueof=EnumName.GREEN;
        EnumName green = EnumName.GREEN;
        EnumName green1 = EnumName.RED;
        EnumName green2 = EnumName.YELLOW;

        ArrayList<EnumName> sf = new ArrayList<>();
        sf.add(green);
        sf.add(green1);
        sf.add(green2);
        sf.sort(Enum::compareTo);
        //internally : public static final week Monday = new week();
        System.out.println(sf);
        System.out.println(Arrays.toString(EnumName.values()));

        EnumName red = EnumName.valueOf("RED");
        System.out.println(red);
    }
}
