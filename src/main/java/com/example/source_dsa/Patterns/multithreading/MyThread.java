package com.example.source_dsa.Patterns.multithreading;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("override thread");
    }

    public static void main(String[] args) {
       MyThread myThread = new MyThread();
        //if we use try(), it will lose context switching
       myThread.start();
    }
}



