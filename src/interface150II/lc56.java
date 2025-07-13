package interface150II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc56 {

    public int[][] merge(int[][] intervals) {
//        todo 有小问题，没解决出来
        if (intervals == null || intervals.length == 0) {
            return new int[0][2];
        }

        // 按左端点排序
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 0; i < intervals.length; i++) {
            int[] cur = intervals[i];
            if (cur[0] <= end) {
                end = Math.max(cur[1], end);
            } else {
                result.add(new int[]{start, end});
                start = cur[0];
                end = cur[1];
            }
        }
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        lc56 lc56 = new lc56();
        int[][] intervals = lc56.merge(new int[][]{{1,3}, {2,6}, {8,10}, {15,18}});

    }
}
