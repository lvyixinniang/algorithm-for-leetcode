package interface150III;

import java.util.PriorityQueue;

/**
 * @author hc
 * @date
 **/
public class lc215 {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) pq.poll();
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        lc215 lc = new lc215();
        lc.findKthLargest(new int[]{3,2,1,5,6,4}, 2);
    }
}
