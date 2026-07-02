package interface150III;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hc
 * @date
 **/
public class lc56 {
// todo 需要考虑合并后的问题
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];

        // 按左端点升序排序
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0]; // 当前合并区间

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                // 重叠：更新当前合并区间的右端点（取较大值）
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // 不重叠：将当前合并区间加入结果，并开始新区间
                merged.add(current);
                current = intervals[i];
            }
        }
        // 别忘了最后一个区间
        merged.add(current);

        return merged.toArray(new int[merged.size()][]);
    }
}
