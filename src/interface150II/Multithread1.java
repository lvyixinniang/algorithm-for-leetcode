package interface150II;

import java.util.concurrent.locks.*;


public class Multithread1 {
    private static int num = 1;
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition[] conditions = {lock.newCondition(), lock.newCondition()};

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            int threadId = i;
            new Thread(() -> {
                while (num <= 100) {
                    lock.lock();
                    try {
                        while (num % 2 != threadId) {
                            conditions[threadId].await();
                        }
                        if (num <= 100) {
                            System.out.println("thread " + threadId + " is " + num++);
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    conditions[(threadId + 1) % 3].signal();
                }
            }).start();
        }

    }
}