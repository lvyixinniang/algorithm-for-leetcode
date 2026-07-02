package interface150III;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hc
 * @date
 **/
public class lc435 {

    public int eraseOverlapIntervals(int[][] intervals) {
        int m = intervals.length;
        int n = 2;

        // 排序
        Arrays.sort(intervals, (a, b) -> {
            return a[1] != b[1] ? a[1] - b[1] : a[0] - b[0];
        });
        List<List<Integer>> res = new ArrayList<>();

        for (int[] interval : intervals) {
            res.add(Arrays.asList(interval[0], interval[1]));
        }

        int count = 0;
        int i = 1;
        while(i < res.size()) {
            // 保留前者， 即右侧小的区间
            if (res.get(i).get(0) < res.get(i-1).get(1)) {
                // 例如1， 在【1,2】中
                // 但 会不会有【1,1】这种情况啊 -5 * 104 <= starti < endi <= 5 * 104 ，没有这种情况
                //那么就要舍弃当前， 必须用集合了
                res.remove(i);
                count++;
            } else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        lc435 lc435 = new lc435();
        int[][] intervals = {{1, 2}, {1,2}, {1,2}};
        System.out.println(lc435.eraseOverlapIntervals(intervals));
    }
}
