package org.itstep.concurrency;

public class MemoryConsistencyError {
    private static volatile boolean flag = false; //убери volatile и будет }|{опа

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            while (!flag) Thread.onSpinWait();
            System.out.println("hello");
            while (flag) Thread.onSpinWait();
            System.out.println("bye");
        });

        thread.start();
        Thread.sleep(100);

        System.out.println("say hello");
        flag = true;

        Thread.sleep(100);
        System.out.println("say bye");
        flag = false;
    }
}
