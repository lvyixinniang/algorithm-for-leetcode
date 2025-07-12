package interface150II;

import java.util.HashSet;
import java.util.Set;

public class lc36 {

    public boolean isValidSudoku(char[][] board) {
        // 数字 1-9 在每一行只能出现一次。
        for (int i = 0; i < board.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.' && set.contains(board[i][j]))
                    return false;
                set.add(board[i][j]);
            }
        }

        // 数字 1-9 在每一列只能出现一次。
        for (int i = 0; i < board.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[j][i] != '.' && set.contains(board[j][i]))
                    return false;
                set.add(board[j][i]);
            }
        }

        // 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Set<Character> set = new HashSet<>();
                for (int i1 = 0; i1 < 3; i1++) {
                    for (int j1 = 0; j1 < 3; j1++) {
                        int row = i * 3 + i1;
                        int col = j * 3 + j1;
                        if (board[row][col] != '.' && set.contains(board[row][col]))
                            return false;
                        set.add(board[row][col]);
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lc36 lc36 = new lc36();
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
            ,{'6','.','.','1','9','5','.','.','.'}
            ,{'.','9','8','.','.','.','.','6','.'}
            ,{'8','.','.','.','6','.','.','.','3'}
            ,{'4','.','.','8','.','3','.','.','1'}
            ,{'7','.','.','.','2','.','.','.','6'}
            ,{'.','6','.','.','.','.','2','8','.'}
            ,{'.','.','.','4','1','9','.','.','5'}
            ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(lc36.isValidSudoku(board));
    }
}
