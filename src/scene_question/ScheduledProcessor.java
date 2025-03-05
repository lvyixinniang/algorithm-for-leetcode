package scene_question;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledProcessor {

    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public void startProcessing() {
        final Runnable task = new Runnable() {
            public void run() {
// 这里放置实际的任务逻辑
                System.out.println("Executing task at " + System.currentTimeMillis());
            }
        };

// 每隔5秒执行一次任务，初始延迟为0秒
        scheduler.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
    }

    public void stopProcessing() {
        scheduler.shutdown();
        try {
            if (!scheduler.awaitTermination(60, TimeUnit.SECONDS)) {
                scheduler.shutdownNow();
            }
        } catch (InterruptedException ex) {
            scheduler.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ScheduledProcessor processor = new ScheduledProcessor();
        processor.startProcessing();

// 让程序运行一段时间后停止
        Thread.sleep(20000);
        processor.stopProcessing();
    }

}
