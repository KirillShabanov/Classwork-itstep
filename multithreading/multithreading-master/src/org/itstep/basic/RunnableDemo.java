package org.itstep.basic;

public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Creating Runnable");
        Runnable runnable = new RunnableSample();
        System.out.println("Creating Thread");
        Thread thread = new Thread(runnable);
        System.out.println("Starting Thread");
        thread.start();

        //thread.setPriority(Thread.MIN_PRIORITY); - задать приоритет

        thread.join(); // меняет ход истории (нарушает поточность)

        System.out.println("Finish: "+Thread.currentThread().getName());
    }
}

class RunnableSample implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<5; i++)
            System.out.println(i+" "+Thread.currentThread().getName());
        System.out.println("Finish: "+Thread.currentThread().getName());
    }
}
