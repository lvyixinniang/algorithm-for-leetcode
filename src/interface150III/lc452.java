package interface150III;

import java.util.Arrays;

/**
 * @author hc
 * @date
 **/
public class lc452 {
// todo 缩小区间案例
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int n = points.length;
        int m =n;
        int[] current = new int[2];
        current[0] = points[0][0];
        current[1] = points[0][1];
        for (int i = 1; i < n; i++) {
            if (points[i][0] <= current[1]) {
                current[1] = Math.min(current[1], points[i][1]);
                m--;
            } else {
                current[0] = points[i][0];
                current[1] = points[i][1];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        lc452 solution = new lc452();
        System.out.println(solution.findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}));
    }
}
