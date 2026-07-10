package interface150III;

import java.util.Arrays;

/**
 * @author hc
 * @date
 **/
public class lc130 {
// todo 这道题目正向思路无法通过，只能逆向思维
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    boolean flag = tracing(board, i, j);
                    if (flag) {
                        setX(board, i , j);
                    }
                }
            }
        }

    }
    private boolean tracing(char[][] board, int i, int j) {
        int m = board.length, n = board[0].length;
        // 查询到某个边界元素，他的垂直水平越界就意味着失败
        if (i < 0 || i >= m || j < 0 || j >= n) return false;
        if (board[i][j] == 'O') {
            // 继续递归
            //上左下右
            // 当前格子是 'O'，标记为已访问（临时改为 '#'）
            board[i][j] = '#';

            // 递归检查四个方向，必须所有方向都返回 true（即都被挡住）才表示被包围
            boolean up = tracing(board, i - 1, j);
            boolean down = tracing(board, i + 1, j);
            boolean left = tracing(board, i, j - 1);
            boolean right = tracing(board, i, j + 1);

            // 注意：这里用 && 表示所有方向都被挡住
            boolean surrounded = up && down && left && right;

            // 回溯：恢复当前格子为 'O'（因为后续其他区域可能用到）
            board[i][j] = 'O';
            return surrounded;
        } else {
            return true;
        }
    }

    private void setX(char[][] board, int i, int j) {
        int m = board.length, n = board[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != 'O') return;
        board[i][j] = 'X';
        setX(board, i - 1, j);
        setX(board, i, j - 1);
        setX(board, i + 1, j) ;
        setX(board, i, j + 1);
    }
}
