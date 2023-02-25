package com.example.source_dsa.Patterns.Recursion.customarraylistgenerics;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author : ArbindSharma
 * @Date : 24-02-2023
 **/
public class CustomArraylist<T> {

    private static final int DEFAULT_SIZE = 10;

    //also working as index value.
    private static int size = 0;
    private Object[] data;

    //you can't create an instance of generic type
    //cuz it happen in runtime
    private CustomArraylist() {
        this.data = new Object[DEFAULT_SIZE];
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "Added size = "+ size+ " "+
                "++++++++++    \n data=" + Arrays.toString(data) +
                '}';
    }

    public static void main(String[] args) {

      /*  CustomArraylist arrayList = new CustomArraylist();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(4);

        System.out.println(arrayList);*/

                CustomArraylist<Integer> arrayList = new CustomArraylist();
                arrayList.add(34);
                arrayList.add(Integer.valueOf("kjfd"));


    }

    public void add(T num) {
        if (isFull()) {
            resize();
        } else {
            data[size++] = num;
        }
    }

    private void resize() {
        Object[] tempArray = new Object[data.length * 2];
        //copy the currrent itemsm in the new array
        for (int i = 0; i < data.length; i++) {
            tempArray[i] = data[i];
        }
        //point to temp array
        data = tempArray;
    }

    //here its removing from a bigger size object so cast is necessary
    public T remove() {
        T removed = (T)data[--size];
        return removed;
    }

    //get data at any index
    public T get(int index) {
        return (T)data[index];
    }

    //get size of arraylist
    public int returnSize() {
        return data.length;
    }

    //set data at any location
    //in bigger one you are adding the smaller one so no casting is required
    public void set(int index, T value) {
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

}
