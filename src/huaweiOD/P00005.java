package huaweiOD;

import java.util.Scanner;

/**
 * @author hc
 * @date
 **/
public class P00005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[][] graph = new boolean[M][M];
        for (int i = 0; i < N; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            graph[u][v] = true;
            graph[v][u] = true;
        }

        int total = 0;
        // 1=红 0=黑
        //M 个节点共有 2^M 种不同的染色方案
        for (int mask = 0; mask < (1 << M); mask++) {
            boolean valid = true;
            outer:
            for (int u = 0; u < M; u++) {
                if ((mask >> u & 1) == 1) { // 第u个是红色 0.。。m
                    for(int v = u + 1; v < M; v++) { //从u+1开始
                        if (graph[u][v] && (mask >> v & 1) == 1) {
                            valid = false;
                            break outer;
                        }
                    }
                }
            }
            if (valid) {
                total++;
            }
        }
        System.out.println(total);
    }
}















