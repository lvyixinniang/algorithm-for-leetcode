package interface150II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size(); //高度
//        先初始化第一列
        int[][] dp = new int[m][m];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < m; i++) {
            dp[i][0] = triangle.get(i).get(0) + dp[i - 1][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j <= i; j++) {
                if (j < i){
                    dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i - 1][j], dp[i -1][j - 1]);
                }else {
                    dp[i][j] = triangle.get(i).get(j) + dp[i - 1][j - 1];
                }

            }
        }

//        求最下层
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            min = Math.min(min, dp[m - 1][i]);
        }
        return min;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3,4),
                Arrays.asList(6,5,7),
                Arrays.asList(4,1,8,3)
        );
    lc120 solution = new lc120();
    System.out.println(solution.minimumTotal(triangle));
    }
}
