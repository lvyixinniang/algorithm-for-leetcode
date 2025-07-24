package interface150II;

import java.util.Arrays;
import java.util.Comparator;

public class lc452 {
    public int findMinArrowShots(int[][] points) {
        // 区间的考法，就只有求 【交并补】集合
        // 多去寻找重合点
//        todo 区间的 交集 没get到思路 2025/7/20(重做 不会）
        Arrays.sort(points, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        int len = points.length;
        int res = len;
        for (int i = 1; i < len; i++) {
            if (points[i][0] <= points[i - 1][1] ) {
                res --;
//                动态变化 缩小范围
                points[i][0] = Math.max(points[i][0], points[i - 1][0]);
                points[i][1] = Math.min(points[i][1], points[i - 1][1]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc452 c = new lc452();
        System.out.println(c.findMinArrowShots(new int[][]{{10,16}, {2,8}, {1,6}, {7,12}}));
    }
}
