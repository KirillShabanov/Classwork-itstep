package org.itstep.basic;

public class ThreadDemo extends Thread{
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        System.out.println("Creating Thread");
        Thread thread = new ThreadDemo();
        System.out.println("Starting Thread");
        thread.start();

        System.out.println("Finish: "+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++)
            System.out.println(i+" "+Thread.currentThread().getName());
        System.out.println("Finish: "+Thread.currentThread().getName());
    }
}
