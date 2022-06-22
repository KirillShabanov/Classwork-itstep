package org.itstep.basic;

public class RunnableAnonymous {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Creating Runnable");
        Runnable runnable = new Runnable(){

            @Override
            public void run() {
                for (int i=0; i<5; i++)
                    System.out.println(i+" "+Thread.currentThread().getName());
                System.out.println("Finish: "+Thread.currentThread().getName());
            }
        };

        System.out.println("Creating Thread");
        Thread thread = new Thread(runnable);
        System.out.println("Starting Thread");
        thread.start();

        thread.join();

        System.out.println("Finish: "+Thread.currentThread().getName());
    }
}
