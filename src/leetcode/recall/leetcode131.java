package leetcode.recall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode131 {
//    回溯法 + 动态规划 + 预处理
    static boolean[][] flag;
    static List<List<String>> ret = new ArrayList<List<String>>();
    static List<String> ans = new ArrayList<String>();
    static int n;
    public static List<List<String>> partition(String s) {
        n = s.length();
        flag = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(flag[i], true);
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                char c = s.charAt(i);
                char c1 = s.charAt(j);
//                动态规划 做 预处理
                flag[i][j] = (s.charAt(i) == s.charAt(j)) && flag[i + 1][j -1];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        partition("aab");
    }
}
