package org.itstep.concurrency;

import java.util.concurrent.*;

public class Condition {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Counter counter = new Counter();
        for (int i =0;i<1000;i++)
            executorService.submit(counter::inc);
        executorService.shutdown();
        executorService.awaitTermination(60,TimeUnit.SECONDS);
        System.out.println(counter.getCount());
    }
}

class Counter {
    private int count = 0;

    public void inc(){
        synchronized (this) {
            count++;
        }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            notifyAll();
    }

    public int getCount() {
        return count;
    }
}
