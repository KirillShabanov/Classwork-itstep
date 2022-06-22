package org.itstep.runners.runnersInf;


//кто кого?)
public class Runners {
    public static void main(String[] args) throws InterruptedException {
       Runner1 runner1 = new Runner1();
       Runner2 runner2 = new Runner2();

       Thread thread1 = new Thread(runner1);
       Thread thread2 = new Thread(runner2);

       thread1.start();
       thread2.start();

       /*
       long begin = System.currentTimeMillis();
       long end = begin+3000;

       while (System.currentTimeMillis()<end);
       */

        Thread.sleep(3000);

       thread1.interrupt();
       thread2.interrupt();
    }
}

class Runner1 implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while (true){
            System.out.println("Runner 1, " + "step: " + i++);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //e.printStackTrace(); - чтобы скрыть косяк
                break;
            }
        }
    }
}

class Runner2 implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while (true){
            System.out.println("Runner 2, " + "step: " + i++);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //e.printStackTrace(); - чтобы скрыть косяк
                break;
            }
        }
    }
}
