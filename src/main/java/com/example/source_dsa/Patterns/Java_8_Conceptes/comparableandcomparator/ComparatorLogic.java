package com.example.source_dsa.Patterns.Java_8_Conceptes.comparableandcomparator;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//comparable and comparator both are interface


//comparator me Main ke ander implementation do
//and make a  object inside main and give implementation of how to compare
//you will get two objects to compare the values
// Collections.sort(al, Comparator.comparing(ComparatorLogic::getName));
public class ComparatorLogic {

    public ComparatorLogic(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    private double rating;
    private String name;
    private int year;

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

    public static void main(String[] args) {



			/*	Comparator<ComparatorLogic> comp = new Comparator<>() {

					@Override
					public int compare(ComparatorLogic o1, ComparatorLogic o2) {
*//*
						if (o1.getYear() < o2.getYear()) {

							return o1.getName().compareTo(o2.getName());
						} else {
							return o1.getName().compareTo(o2.getName());
						}*//*

						return o1.getName().compareTo(o2.getName());

						//for only sorting by year
//						return o1.getYear()-o2.getYear();

					}
				};*/

    /*    Comparator<ComparatorLogic> comp = new Comparator<ComparatorLogic>() {
            @Override
            public int compare(ComparatorLogic o1, ComparatorLogic o2) {
                return (int) (o1.getRating() - o2.getRating());
            }
        };*/

     //   Comparator<ComparatorLogic> comp = (c1,c2) -> c1.getYear()-c2.getYear();

        //using method reference to get year
        Comparator<ComparatorLogic> comp = Comparator.comparingInt(ComparatorLogic::getYear);


        ArrayList<ComparatorLogic> al = new ArrayList<>();
        al.add(new ComparatorLogic(0.3, "ehe", 122));
        al.add(new ComparatorLogic(0.4, "ahe", 112));
        al.add(new ComparatorLogic(0.5, "the", 1222));
        al.add(new ComparatorLogic(0.1, "ihe", 123));
        al.add(new ComparatorLogic(0.1, "iae", 122222));

//        al.sort(comp);

       // Collections.sort(al, (l1,l2) -> (int) (l1.getRating() - l2.getRating())); or
//        al.sort(add logic for comparator);
        /*al.sort(new Comparator<ComparatorLogic>() {
            @Override
            public int compare(ComparatorLogic o1, ComparatorLogic o2) {
                return 0;
            }
        });*/

        al.sort(new Comparator<ComparatorLogic>(){
            public int compare(ComparatorLogic o1, ComparatorLogic o2){
                return o1.getYear()-o2.getYear();
            }
        });




        for (ComparatorLogic i : al) {

            System.out.println(i.getRating() + " " + i.getName() + " " + i.getYear());

        }

    }

}















