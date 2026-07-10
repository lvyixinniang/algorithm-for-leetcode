package interface150III;

/**
 * @author hc
 * @date
 **/
public class lc79 {
//todo 为什么要标注走过的
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
//                    boolean isTrue = backTracing(board, word, i, j, 0);
                    boolean isTrue = backTracing(board, word, new StringBuilder(), i, j);
                    if (isTrue) return true;
                }
            }
        }
        return false;
    }

    private boolean backTracing(char[][] board, String word
            , int i, int j, int k) {
        if (k == word.length()) return true;
        int m = board.length, n = board[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(k)) return false;
        // 已走过，就说明不可能了
        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = backTracing(board, word, i + 1, j, k + 1) ||
                backTracing(board, word, i, j, k) ||
                backTracing(board, word, i, j, k) ||
                backTracing(board, word, i, j, k + 1);
        board[i][j] = temp;
        return found;
    }

    private boolean backTracing(char[][] board, String word
            , StringBuilder sb, int i, int j) {
        if (sb.length() == word.length()) {
            String s = sb.toString();
            return s.equals(word);
        }
        int m = board.length, n = board[0].length;
        if (i < 0 || i >= m || j < 0
                || j >= n || board[i][j] != word.charAt(sb.length())) return false;
        sb.append(board[i][j]);
        char temp = board[i][j];
        board[i][j] = '#';
        boolean left = backTracing(board, word, sb, i, j - 1);
        boolean right = backTracing(board, word, sb, i, j + 1);
        boolean up = backTracing(board, word, sb, i + 1, j);
        boolean down = backTracing(board, word, sb, i - 1, j);
        sb.deleteCharAt(sb.length() - 1);
        board[i][j] = temp;
        return left || right || up || down;
    }

    public static void main(String[] args) {
        lc79 lc79 = new lc79();
        char[][] grid = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        System.out.println(lc79.exist(grid, "ABCB"));
    }
}
