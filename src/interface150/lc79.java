package interface150;

public class lc79 {
// todo 未解决
    public boolean exist(char[][] board, String word) {
        int len = word.length();
        StringBuilder sb = new StringBuilder();
        return backStracking(board, word, sb, 0, 0, 0);
    }

    private boolean backStracking(char[][] board, String word, StringBuilder sb, int y, int x, int index) {
        if (sb.length() == word.length()) {
            return true;
        } else {
            // DFS 左 ， 右，上，  下
            if (x > 0) {
                // 可以有 左 ， 右， 下
            }
        }
        return false;
    }
}
