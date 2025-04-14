package interface150;

import java.util.Arrays;

public class zijie2 {

    public int[] findElement (int[][] mat, int n, int m, int x) {
        // write code here
        // 逐层二分
        int[] res = new int[2];
        Arrays.fill(res,-1);
        for (int i = 0; i < n; i++) {
            if (x >= mat[i][0] && x <= mat[i][m - 1]) {
                // 说明就在此层
                int l = 0, r = m - 1;
                while (l <= r) {
                    int mid = l + (r - l) / 2;
                    if (mat[i][mid] == x) {
                        res[0] = i;
                        res[1] = mid;
                        return res;
                    }else if (mat[i][mid] < x) {
                        l = mid + 1;
                    }else {
                        r = mid - 1;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        zijie2 z = new zijie2();
        int[][] mat = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(z.findElement(mat,2,3,6));
    }
}
