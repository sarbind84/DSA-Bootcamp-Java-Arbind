package com.example.source_dsa.Patterns.multithreading;

/**
 * @Author : ArbindSharma
 * @Date : 11-04-2023
 **/
public class myThreadByRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("by runnable interface");
    }

    public static void main(String[] args) {
        myThreadByRunnable myThreadByRunnable = new myThreadByRunnable();
        Thread thread = new Thread(myThreadByRunnable);
        thread.start();

    }
}
