package interface150II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc120 {
        public int minimumTotal(List<List<Integer>> triangle) {
            int m = triangle.size(), n = triangle.get(m - 1).size();
            int[][] dp = new int[m][n];
            dp[0][0] = triangle.get(0).get(0);
            for (int i = 1; i < m; i++) {
                for (int j = 0; j <triangle.get(i).size(); j++) {
                    // 1,0
                    if (j == 0) {
                        dp[i][0] = dp[i-1][0] + triangle.get(i).get(0);
                    }else if (j < triangle.get(i).size() - 1) {
                        // 1,1
                        dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-1]) + triangle.get(i).get(j);
                    } else {
                        dp[i][j] = dp[i -1][j- 1] +triangle.get(i).get(j);
                    }
                }
            }

            int minn = Integer.MAX_VALUE;
            for (int i = 0; i < n; i ++) {
                minn = Math.min(minn, dp[m-1][i]);
            }

            return minn;
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
