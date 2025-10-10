package interface150II;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_ADDPeer;

import java.util.PriorityQueue;
import java.util.Random;

public class lc215 {
//todo 堆排 + 快排
/*    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            if (minHeap.size() < k) {
                minHeap.add(num);
            } else if (num > minHeap.peek()) {
                minHeap.poll(); // 移除堆顶元素
                minHeap.add(num);
            }
        }
        return minHeap.peek();
    }*/


    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            if (pq.size() < k) pq.add(num);
            else if (pq.peek() <num) {
                pq.poll();
                pq.add(num);
            }
        }
        return pq.peek();
    }


}
