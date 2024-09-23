package leetcode.Array;

import java.util.*;

public class leetcode189 {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }
    public static void rotate(int[] nums, int k) {
/*//        双向队列
        LinkedList<Integer> queue = new LinkedList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            queue.add(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            Integer last = queue.removeLast();
            queue.addFirst(last);
        }

        for (int i = 0; i < n; i++) {
            nums[i] = queue.removeFirst();
        }*/

        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }
}
