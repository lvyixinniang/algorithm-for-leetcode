package JUC;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hc
 * @date
 **/
public class DataQueryExample {

    public static void main(String[] args) throws InterruptedException {

        int totalRecords = 10000;
        int threadCount = 20;
        int batchSize = totalRecords / threadCount;

        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        CountDownLatch latch = new CountDownLatch(threadCount);

        ConcurrentLinkedQueue<String> result = new ConcurrentLinkedQueue<>();

        for (int i = 0; i < threadCount; i++) {
            int start = i * batchSize;
            int end = (i == threadCount - 1) ? totalRecords : start + batchSize;

            executor.execute(() -> {
                try {
                    for (int j = start; j < end; j++) {
                        result.add("Data-" + j);
                    }
                    System.out.println(Thread.currentThread().getName() + " 处理数据 " + start + " - " + end);
                } finally {
                    latch.countDown();
                }
            });
        }

        latch.await();
        executor.shutdown();

        System.out.println(result);
    }
}
