package interface150;

import java.util.*;

public class lc373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pg = new PriorityQueue<>(k, (o1, o2) -> {
            return nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]];
        });
        List<List<Integer>> res = new ArrayList<>();
        int m = nums1.length;
        int n = nums2.length;
        for (int i = 0; i < Math.min(m, k); i++) {
            pg.offer(new int[]{i, 0});
        }
        while (k -- > 0 && !pg.isEmpty()) {
            int[] idxPair = pg.poll();
            List<Integer> list = new ArrayList<>();
            list.add(nums1[idxPair[0]]);
            list.add(nums2[idxPair[1]]);
            res.add(list);
            if (idxPair[1] + 1 < n) {
                pg.offer(new int[]{idxPair[0], idxPair[1] + 1});
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc373 lc373 = new lc373();
        System.out.println(lc373.kSmallestPairs(new int[]{1,1,2}, new int[]{1,2,3},2));
    }
}
