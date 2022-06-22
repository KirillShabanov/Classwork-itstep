package org.itstep.producer_consumer;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer<Integer> producerConsumer = new ProducerConsumer<>();
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        Runnable producer = ()->{
            try {
                Thread.sleep(500);
                producerConsumer.produce(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable consumer = ()->{
            try {
                Thread.sleep(1500);
                producerConsumer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        ScheduledFuture future1 = executorService.scheduleAtFixedRate(producer,0,1, TimeUnit.SECONDS);
        ScheduledFuture future2 = executorService.scheduleAtFixedRate(consumer,1,1, TimeUnit.SECONDS);

        Thread.sleep(10000);

        executorService.shutdown();
    }
}

class ProducerConsumer<T>{
    private static final int bufferSize = 10;
    private List<T> buffer = new LinkedList<>();

    public synchronized void produce(T value) throws InterruptedException {
        while (buffer.size()==bufferSize) wait();
        buffer.add(value);
        System.out.println("producer: "+buffer.size());
        notify();
    }

    public synchronized T consume() throws InterruptedException {
        while (buffer.size()==0) wait();
        T value = buffer.remove(0);
        System.out.println("consumer: "+buffer.size());
        notify();
        return value;
    }
}
