package interface150II;

public class lc289 {

    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
//        中间状态
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int life = count(board, i, j);

                if (board[i][j] == 1) {
                    // judge
                    if (life < 2 || life > 3) board[i][j] = -1;
                }else {
                    // judge
                    if (life == 3) board[i][j] = 2;
                }
            }
        }
        //            转换中间状态
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == -1) {
                    board[i][j] = 0;
                } else if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
        }
    }

    private int count(int[][] board, int i, int j) {
        int life = 0;
        int m = board.length, n = board[0].length;
        if (i > 0 && j > 0 && (board[i-1][j-1] == 1 || board[i-1][j - 1] == -1)) {
            life++;
        }
        if (j > 0 && (board[i][j-1] == 1 || board[i][j-1] == -1)) {
            life++;
        }
        if (i < m - 1 && j > 0 && (board[i+1][j-1] == 1 || board[i+1][j - 1] == -1)) {
            life++;
        }
        if (i > 0 && (board[i-1][j] == 1 || board[i-1][j] == -1)) {
            life++;
        }
        if (i < m - 1 && (board[i+1][j] == 1 || board[i+1][j] == -1)) {
            life++;
        }
        if (i > 0 && j < n - 1 && (board[i-1][j+1] == 1 || board[i-1][j+1] == -1)) {
            life++;
        }
        if (j < n - 1 && (board[i][j+1] == 1 || board[i][j+1] == -1)) {
            life++;
        }
        if (i < m - 1 && j < n - 1 && (board[i+1][j+1] == 1 || board[i+1][j+1] == -1)) {
            life++;
        }
        return life;
    }
}
