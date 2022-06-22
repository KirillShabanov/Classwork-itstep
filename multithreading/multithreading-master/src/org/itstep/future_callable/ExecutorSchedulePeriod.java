package org.itstep.future_callable;

import java.util.concurrent.*;
import java.util.stream.Stream;

public class ExecutorSchedulePeriod {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        ScheduledFuture future1 = executorService.scheduleAtFixedRate(getRunnable(),3,5, TimeUnit.SECONDS);
        ScheduledFuture future2= executorService.scheduleAtFixedRate(getRunnable(),3,5, TimeUnit.SECONDS);

        Thread.sleep(10000);
        future1.cancel(true);
        future2.cancel(true);

        executorService.shutdown();
    }

    public static Runnable getRunnable() {
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
            System.out.println( Thread.currentThread().getName() +
                    " is finished, sum:" + sum);
        };
    }
}
