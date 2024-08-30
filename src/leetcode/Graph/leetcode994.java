package leetcode.Graph;

import java.util.*;

public class leetcode994 {
    int[] dr = new int[]{-1 , 0, 1 ,0};
    int[] dc = new int[]{0 , -1, 0, 1};

    public int orangesRotting(int[][] grid) {
        int R = grid.length, C = grid[0].length;
        Queue<Integer> queue = new ArrayDeque<Integer>();
        Map<Integer, Integer> depth = new HashMap<Integer, Integer>();
        for (int r = 0; r < R; ++r){
            for (int c =0 ; c < C ; ++c){
                int code = r * C + c;
                queue.add(code);
                depth.put(code , 0);
            }
        }
        int ans = 0;
        while (!queue.isEmpty()){
            int code = queue.remove();
            int r = code / C , c = code % C;
            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (0< nr && nr < R && 0<c && c< C && grid[nr][nc] == 1){
                    grid[r][c] =2;
                    int ncode = r * C +c;
                    queue.add(ncode);
                    depth.put(ncode, depth.get(ncode) + 1);
                    ans = depth.get(ncode);
                }
            }
        }
        for (int[] rows : grid) {
            for (int row : rows) {
                if (row == 1){
                    return -1;
                }
            }
        }
        return ans;
    }
}
