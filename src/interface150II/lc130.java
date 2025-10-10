package interface150II;

import java.util.ArrayList;
import java.util.List;




public class lc130 {
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        // 查询在边界上的0， 需要保留
//        第一行 和最后一行
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                insert(board,0, j, m, n);
            }
            if (board[m - 1][j] == 'O') {
                insert(board,m - 1, j, m, n);
            }
        }

//        第一列 和最后 一列
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                insert(board,i, 0, m, n);
            }
            if (board[i][n - 1] == 'O') {
                insert(board,i, n - 1, m, n);
            }
        }

//        将 0变为x， 将T变为0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'T') {
                    board[i][j] = 'O';
                }
            }
        }
        System.out.println(board);
    }

    private void insert(char[][] board , int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'T';

        insert(board, i - 1, j, m, n);
        insert(board, i + 1, j, m, n);
        insert(board, i, j - 1, m, n);
        insert(board, i, j + 1, m, n);
    }

    public static void main(String[] args) {
        lc130 lc130 = new lc130();
        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        lc130.solve(board);
    }
}
