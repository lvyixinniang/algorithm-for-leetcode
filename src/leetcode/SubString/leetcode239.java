package leetcode.SubString;

import java.util.*;

public class leetcode239 {
    public static void main(String[] args) {
        System.out.println(maxSlidingWindow(new int[]{1, -1}, 1));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
/*        int l = 1, r = k;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int[] arr = new int[n + 1 - k];

        for (int i = 0; i < k; i++) {
            max = max > nums[i]? max : nums[i];
        }
        arr[0] = max;

        for (l = 1; r < n; l++) {
            if (max < nums[r]) {
                max = nums[r];
            } else if (max == nums[l] && max > nums[r]) {
                max = Integer.MIN_VALUE;
                for (int j = l; j < r; j++) {
                    max = max > nums[j]? max : nums[j];
                }
            }
            r++;
            arr[l] = max;
        }
        return arr;
*/
        int  n = nums.length;
        /*
deque.pollLast()：
从双端队列的末尾移除并返回最后一个元素。如果队列为空，则返回null。在这个上下文中，它
用于移除小于当前元素的所有元素，以保持队列中的元素递减顺序。

deque.peekLast()：
查看位于队列末尾的元素，但不移除它。如果队列为空，则返回null。在这里用来比较当前元素与队列末尾的元素。

deque.offerLast(i)：
将指定的元素添加到此双端队列的末尾。如果插入操作成功发生，则返回true。在这里用于将索引i添加到队列的末尾，表示当前考虑的元素。 */
        Deque<Integer> deque = new LinkedList<>();
//        增序 的 单调序列
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }

        int[] ans = new int[n - k + 1];
        ans[0] = nums[deque.peekFirst()];
        for (int i = k; i < n; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
//            相当于 我的 l++ r++
            while (deque.peekLast() <= i - k) {
                deque.pollFirst();
            }
            ans[i - k + 1] = nums[deque.peekFirst()];
        }
        return ans;
    }
}
