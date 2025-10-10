package interface150II;

public class lc200 {

    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int land = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    insert(grid, i, j);
                    land++;
                }
            }
        }
        return land;
    }

    private void insert(char[][] grid, int i, int j) {
        if (i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] != '1') return;
        grid[i][j] = 'T';

        insert(grid, i - 1, j);
        insert(grid, i + 1, j);
        insert(grid, i, j - 1);
        insert(grid, i, j + 1);
    }

}
