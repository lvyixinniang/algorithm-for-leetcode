package interface150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc120 {

    public static  int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
               if (j == 0) {
                   dp[i][j] = dp[i - 1][0] + triangle.get(i).get(j);
               }else {
                   dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
               }
            }
        }
        int minn = Integer.MAX_VALUE;
        for (int i = 0; i < triangle.get(len - 1).size(); i++) {
            minn = Math.min(minn, dp[len - 1][i]);
        }
        return minn;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);
        System.out.println(minimumTotal(triangle));
    }
}
