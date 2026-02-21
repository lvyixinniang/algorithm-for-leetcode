package JUC;

import java.util.concurrent.CountDownLatch;

/**
 * @author hc
 * @date
 **/
public class waitToFight {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);

        Thread daqiao = new Thread(() -> waitToFight(latch, "daqiao"), "thread-daqiao");
        Thread lanLingWang = new Thread(() -> waitToFight(latch, "lanqiao"), "thread-lanlingwang");

        daqiao.start();
        lanLingWang.start();

        latch.countDown();
        System.out.println("all thread finished");
    }

    private static void waitToFight(CountDownLatch latch, String name) {
        try {
            latch.await();
            System.out.println(name + " 准备就绪");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(name + "被中断");
        }
    }
}
