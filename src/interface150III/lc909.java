package interface150III;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hc
 * @date
 **/
public class lc909 {

    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                if (cur == n * n) return steps;

                for (int dice = 1; dice <= 6; dice++) {
                    int next = cur + dice;
                    if (next > n * n) break;

                    int[] coord = getPosition(next,n);
                    int r = coord[0], c = coord[1];

                    if (board[r][c] != -1) {
                        // 走传送
                        next = board[r][c];
                    }

                    if (!visited[next]) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }
        }
        return -1;
    }

    private int[] getPosition(int num, int n) {
        int shang = num / n;        // 商
        int yushu = num % n;        // 余数

        int hang, lie;
        if (yushu == 0) {
            // 例如 num=6, shang=1, yushu=0 → 最底行，最右边
            hang = n - shang;           // 行号 = n - 1? 这里 n-shang = 5，正确
            lie = n - 1;                // 最后一列
        } else {
            // 例如 num=16, shang=2, yushu=4 → 倒数第三行，列号 = yushu-1
            hang = n - shang - 1;       // n-2-1=3
            lie = yushu - 1;            // 4-1=3
        }

        // 判断是否需要反转列方向（蛇形）
        // 从底部数第几行：bottomRow = n - 1 - hang
        int bottomRow = n - 1 - hang;
        if (bottomRow % 2 == 1) {
            // 奇数行（从底部数第1,3,5...行）方向相反
            lie = n - 1 - lie;
        }

        return new int[]{hang, lie};
    }

    public static void main(String[] args) {
        lc909 lc909 = new lc909();
        System.out.println(lc909.snakesAndLadders(new int[][]{{-1, -1, -1, -1, -1, -1}
                , {-1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1}
                , {-1, 35, -1, -1, 13, -1}, {-1, -1, -1, -1, -1, -1}
                , {-1, 15, -1, -1, -1, -1}}));
    }
}
