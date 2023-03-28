package com.example.source_dsa.Patterns.Java_8_Conceptes.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;


//comparable and comparator both are interface

public class ComparableLogic implements Comparable<ComparableLogic> {

    private final double rating;
    private final String name;
    private final int year;
    public ComparableLogic(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public static void main(String[] args) {


        ArrayList<ComparableLogic> al = new ArrayList<>();
        al.add(new ComparableLogic(49.00, "ehello1", 2015));
        al.add(new ComparableLogic(19.00, "ahello22", 1977));
        al.add(new ComparableLogic(9.00, "ghello33", 1980));

        Collections.sort(al);

        for (ComparableLogic obj : al) {
            System.out.println(obj.getName() + " " + obj.getRating() + " " + obj.getYear());
        }
    }

    // Getter methods for accessing private data
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(ComparableLogic o) {

        //return (int) (this.rating - o.getRating());

      //  return this.getYear() - o.getYear();

        return this.getName().compareTo(o.getName());

    }


    //	@Override
//	public int compareTo(comparablelogic o) {
//
//		return 0;
//	}

/*     @Override
   public int compareTo(ComparableLogic o) {
        //kiske base pe krna h sorting haina
//			return this.year-year;
//		??how to compare string
//
        return this.getName().compareTo(o.getName());

        //if(this.getName().compareTo(o.getName())) {
//			return 0;
//
//		}else {
//			return -1;
//		}
    }*/




}
