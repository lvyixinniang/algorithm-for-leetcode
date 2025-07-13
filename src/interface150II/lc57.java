package interface150II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || intervals.length == 0) {
            return new int[][]{{newInterval[0], newInterval[1]}};
        }
        int[][] temp = new int[intervals.length + 1][2];
        for (int i = 0; i <= intervals.length; i++) {
            if (i < intervals.length) {
                temp[i][0] = intervals[i][0];
                temp[i][1] = intervals[i][1];
            } else {
                temp[i][0] = newInterval[0];
                temp[i][1] = newInterval[1];
            }
        }

        Arrays.sort(temp, (a,b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int start = temp[0][0];
        int end = temp[0][1];

        for (int i = 0; i < temp.length; i++) {
            if (temp[i][0] <= end) {
                end = Math.max(end, temp[i][1]);
            } else {
                result.add(new int[]{start, end});
                start = temp[i][0];
                end = temp[i][1];
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        lc57 lc57 = new lc57();
        int[][] intervals = new int[][]{};
        int[] newInterval = new int[]{1, 2};
        int[][] result = lc57.insert(intervals, newInterval);
    }
}
