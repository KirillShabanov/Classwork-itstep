package org.itstep.future_callable;

import java.util.concurrent.*;
import java.util.stream.Stream;

public class ExecutorScheduled {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        Callable<String> callable1 = getCallable();
        Callable<String> callable2 = getCallable();

        ScheduledFuture<String> future1 = executorService.schedule(callable1,3, TimeUnit.SECONDS);
        ScheduledFuture<String> future2= executorService.schedule(callable2,3, TimeUnit.SECONDS);

        System.out.println(future1.get());
        System.out.println(future2.get());

        executorService.shutdown();
    }

    public static Callable<String> getCallable() {
        return () -> {
            Integer sum = Stream.iterate(1, i -> i + 1)
                    .limit(10)
                    .peek(p -> {
                        try {
                            Thread.sleep(20);
                            System.out.println(p);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    })
                    .reduce(0, Integer::sum);

            return Thread.currentThread().getName() +
                    " is finished, sum:" + sum;
        };
    }
}