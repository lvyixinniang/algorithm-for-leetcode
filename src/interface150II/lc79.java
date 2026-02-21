package interface150II;

public class lc79 {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        if (m * n < word.length()) return false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean flag = backTrace(board, word, 0, i, j);
                    if (flag) return true;
                }
            }
        }
        return false;
    }

    private boolean backTrace(char[][] board, String word, int index, int i, int j) {
        if (index == word.length()) {
            return true;  // 成功匹配整个单词
        }
        if (i <0 || i>= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index) || index == word.length()) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '2';
        boolean flag = backTrace(board, word, index + 1, i+1, j) ||
        backTrace(board, word, index + 1, i - 1, j) ||
        backTrace(board, word, index + 1, i , j + 1) ||
        backTrace(board, word, index + 1, i, j - 1);
        board[i][j] = temp;
        return flag;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        lc79 lc79 = new lc79();
        lc79.exist(board, "ABCCED");
    }
}
