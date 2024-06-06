package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class leetcode56_Array {
    /*public static void main(String[] args) {
        int[][] intervals =new int[][]{{1,4},{5,6}};
        System.out.println(merge(intervals));
    }*/
    /*public static int[][] merge(int[][] intervals) {

//        System.out.println(intervals);
        if(intervals.length<=1){
            return intervals;
        }

        int len = intervals.length;
        List<int[]> merged = new ArrayList<int[]>();
        int[][] arr =new int[len][2];
        int arrlen = 0;
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]>=intervals[i-1][0] && intervals[i][0]<=intervals[i-1][1]){
                arr[arrlen][0] = Math.min(intervals[i][0],intervals[i-1][0]);
                arr[arrlen++][1] = Math.max(intervals[i][1],intervals[i-1][1]);
            }else if(intervals[i][0]>=intervals[i-1][1]){
                arr[arrlen][0] = intervals[i][0];
                arr[arrlen++][1] = intervals[i][1];
            }
        }
        merged.add(new int[]{arr[0][0],arr[0][1]});
        for (int i = 1; i < arr.length; i++) {
            if(i>0&&arr[i][0]>0){
                merged.add(new int[]{arr[i][0],arr[i][1]});
            }
        }


        return merged.toArray(new int[merged.size()][2]);
    }*/

    /**
     * 我和此代码的区别就在于我的   1 . 数据结构的使用没有这个精妙 ,
     * 2 . 条件的判定有误
     * 3 . sort的排序方法
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        List<int[]> merged = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; ++i) {
            int L = intervals[i][0], R = intervals[i][1];
            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L) {
                merged.add(new int[]{L, R});
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
