package interface150III;

import java.util.*;

/**
 * @author hc
 * @date
 **/
public class lc373 {
// todo 会tle
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0) return res;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[0] + a[1]) - (b[0] + b[1]));
        int n1 = nums1.length, n2 = nums2.length;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                pq.offer(new int[]{nums1[i], nums2[j]});
            }
        }

        for (int i = 0; i < k; i++) {
            List<Integer> list = new ArrayList<>();
            int[] poll = pq.poll();
            list.add(poll[0]);
            list.add(poll[1]);
            res.add(new ArrayList<>(list));
        }
        return res;
    }
}
