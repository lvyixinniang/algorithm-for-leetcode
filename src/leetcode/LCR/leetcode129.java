package leetcode.LCR;

public class leetcode129 {
//    TODO 回溯法 未解决

    public boolean wordPuzzle(char[][] grid, String target) {
        int m = grid.length, n = grid[0].length;
        if (m * n < target.length()) return false;
//        二维dp 上，下，左，右
        boolean[][] flag = new boolean[m + 1][n + 1];
        char c = target.charAt(0);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (c == grid[i][j]) {
                    flag[i + 1][j + 1] = true;
                }
            }
        }

        return false;
    }
}
