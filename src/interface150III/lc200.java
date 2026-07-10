package interface150III;

/**
 * @author hc
 * @date
 **/
public class lc200 {

    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    tracing(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    private void tracing(char[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') return;
        grid[i][j] = '2';
        // 左 右， 上， 下
        tracing(grid, i, j - 1);
        tracing(grid, i, j + 1);
        tracing(grid, i + 1, j);
        tracing(grid, i - 1, j);
    }

    public static void main(String[] args) {
        lc200 lc200 = new lc200();
        char[][] grid = new char[][]{
                {'1', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
                {'1', '1', '1', '0', '1'}
        };
        System.out.println(lc200.numIslands(grid));
    }
}
