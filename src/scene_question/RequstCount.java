package scene_question;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class RequstCount {

    private ConcurrentHashMap<String, AtomicLong> counterMap = new ConcurrentHashMap<>();

    public void recordRequst(int id) {
        long currentMinute = System.currentTimeMillis() / (60 * 1000);
        String key = id + "-" + currentMinute;
        counterMap.computeIfAbsent(key, k -> new AtomicLong(0)).incrementAndGet();
    }

    public long getRequstsPerMinute(int id) {
        long currentMinute = System.currentTimeMillis() / (60 * 1000);
        String key = id + "-" + currentMinute;
        return counterMap.getOrDefault(key, new AtomicLong(0)).get();
    }
}
