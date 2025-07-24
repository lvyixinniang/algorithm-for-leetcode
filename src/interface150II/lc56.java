package interface150II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc56 {

    public int[][] merge(int[][] intervals) {
//        todo 有小问题，没解决出来   2025/7/21
        // 先让区间升序 排列
        Arrays.sort(intervals, (o1,o2) -> Integer.compare(o1[0],o2[0]));
        // 需要动态变化
        List<int[]> list = new ArrayList<>();
        int length = intervals.length;
        for (int i = 1; i < length; i++) {
            if (intervals[i][0] <= intervals[i - 1][1]) {
                // 有区间重合
                // 动态变化
                intervals[i][0] = intervals[i - 1][0];
                intervals[i][1] = Math.max(intervals[i - 1][1], intervals[i][1]);
            } else {
                list.add(intervals[i - 1]);
            }

        }
        list.add(intervals[length - 1]);

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        lc56 lc56 = new lc56();
        int[][] intervals = lc56.merge(new int[][]{{1,3}, {2,6}, {8,10}, {15,18}});

    }
}
