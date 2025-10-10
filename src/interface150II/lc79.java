package interface150II;

public class lc79 {
// todo 错误 9/18
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean flag = backTrace(board, word, i, j, 0);
                    if (flag) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean backTrace(char[][] board, String word, int i, int j, int index) {
        if (i < 0 || j < 0 || i>=board.length || j>=board[0].length || index >= word.length() || board[i][j] != word.charAt(index)) {
            return false;
        }
        index ++;

        boolean flag = backTrace(board, word, i + 1, j, index)
                || backTrace(board, word, i - 1, j, index)
                || backTrace(board, word, i, j + 1, index)
                || backTrace(board, word, i, j - 1, index);
        index --;
        return flag;
    }
}
