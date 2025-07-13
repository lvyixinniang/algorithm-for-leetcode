package interface150II;

import java.util.Arrays;

public class lc452 {
    public int findMinArrowShots(int[][] points) {
        // 区间的考法，就只有求 【交并补】集合
        // 多去寻找重合点
//        todo 区间的 交集 没get到思路
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int n = points.length;
        for (int i = 1; i < points.length; i++) {
            // 查看是否有交集
            if(points[i][0] <= points[i-1][1]) {
                n --;
//                动态变化 一下
                points[i][0] = Math.max(points[i][0], points[i-1][0]);
                points[i][1] = Math.min(points[i][1], points[i-1][1]);
            }
        }
        return n;
    }
}
