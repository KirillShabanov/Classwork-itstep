package org.itstep.runners;


//кто кого?)
public class Runners {
    public static void main(String[] args) {
       Runner1 runner1 = new Runner1();
       Runner2 runner2 = new Runner2();

       Thread thread1 = new Thread(runner1);
       Thread thread2 = new Thread(runner2);

       thread1.start();
       thread2.start();
    }
}

class Runner1 implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("Runner 1, " + "step: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Runner2 implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("Runner 2, " + "step: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
