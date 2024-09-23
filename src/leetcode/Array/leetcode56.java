package leetcode.Array;

import java.util.*;

public class leetcode56 {
    public static void main(String[] args) {
        System.out.println(merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[0] - o2[0];
        }
    });
        int[] pre = intervals[0];
        // 原地操作节省空间：已经确定的区间，直接存储在intervals的前面，k记录序号。
        int k = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] cur  = intervals[i];
            if(cur[0] <= pre[1]){
                // 当前区间的左边界小于前一个区间的右边界时，可以合并，用pre记录
                int e = Math.max(pre[1], cur[1]);
                pre = new int[]{pre[0], e};
            }else{
                // 和前一个不能合并时，将pre记录在intervals的前面，更新pre为cur
                intervals[k++] = pre;
                pre = cur;
            }
        }
        // 记录最后一个区间
        intervals[k++] = pre;
        // 对intervals截断，只取前面的结果部分
        return Arrays.copyOfRange(intervals,0, k);
    }
}
