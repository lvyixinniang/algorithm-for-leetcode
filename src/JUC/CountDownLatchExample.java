package JUC;

import java.util.concurrent.CountDownLatch;

/**
 * @author hc
 * @date
 **/
public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        int latchNum = 10;
        CountDownLatch latch = new CountDownLatch(latchNum);

        for (int i = 0; i < latchNum; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                    System.out.println(Thread.currentThread().getName() + " complete");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    latch.countDown();
                }
            }).start();
        }

        latch.await();
        System.out.println("all thread finished");
    }
}
