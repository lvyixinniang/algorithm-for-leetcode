package leetcode.recall;

public class leetcode79 {

    public boolean exist(char[][] board, String word) {
        int r = board.length, l = board[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < l; j++) {
                if (board[i][j] == word.charAt(0) && process(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean process(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#'; // 标记为已访问

        boolean found = process(board, word, i + 1, j, index + 1) ||
                process(board, word, i - 1, j, index + 1) ||
                process(board, word, i, j + 1, index + 1) ||
                process(board, word, i, j - 1, index + 1);

        board[i][j] = temp; // 恢复原状态
        return found;
    }
}
