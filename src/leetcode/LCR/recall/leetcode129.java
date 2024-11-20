package leetcode.LCR.recall;

public class leetcode129 {
    public static void main(String[] args) {
        System.out.println(wordPuzzle(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
    }

    public static boolean wordPuzzle(char[][] grid, String target) {
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == target.charAt(0)) {
                    String res = "";
                    if (search(i, j, grid , target, res)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean search(int i, int j, char[][] grid, String target, String res) {
        char c = grid[i][j];
        res += c;
        int size = res.length();
        int m = grid.length, n = grid[0].length;
        if (res.charAt(size - 1) == target.charAt(size - 1)) {
            if (size == target.length()) {
                return true;
            }
        }
        // 上
        if (i - 1 >= 0 && grid[i - 1][j] != '1' && grid[i - 1][j] == target.charAt(size)) {
            grid[i][j] = '1';
            boolean up = search(i - 1, j, grid, target, res);
            grid[i][j] = c;
            if (up) return true;
        }
        // 下
        if (i + 1 < m && grid[i + 1][j] != '1' && grid[i + 1][j] == target.charAt(size)) {
            grid[i][j] = '1';
            boolean down = search(i + 1, j, grid, target, res);
            grid[i][j] = c;
            if (down) return true;
        }
        // 左
        if (j - 1 >= 0 && grid[i][j - 1] != '1' && grid[i][j - 1] == target.charAt(size)) {
            grid[i][j] = '1';
            boolean left = search(i, j - 1, grid, target, res);
            grid[i][j] = c;
            if (left) return true;
        }
        // 右
        if (j + 1 < n && grid[i][j + 1] != '1' && grid[i][j + 1] == target.charAt(size)) {
            grid[i][j] = '1';
            boolean right = search(i, j + 1, grid, target, res);
            grid[i][j] = c;
            if (right) return true;
        }
        return false;
    }
}
