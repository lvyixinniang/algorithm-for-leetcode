package PDD2025;


import javax.xml.soap.Node;
import java.util.*;
public class temp {


    // 注意类名必须为 Main, 不要有任何 package xxx 信息

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long[][] arr = new long[n][3];
                for (int i = 0; i < n; i++) {
                    arr[i][0] = sc.nextInt(); // xi
                    arr[i][1] = sc.nextInt(); // yi
                    arr[i][2] = sc.nextInt(); // ri
                }
                // 还得是 直线距离
                // 邻接矩阵？？
                int[][] motrix = new int[n][n];
                // 初始化
                for (int i = 0; i < n; i++) {
                    Arrays.fill(motrix[i], 0);
                    motrix[i][i] = 1;
                }
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        // 第i个 和 第j个
                        long xi = arr[i][0];
                        long yi = arr[i][1];
                        long xj = arr[j][0];
                        long yj = arr[j][1];

                        long ri = arr[i][2];
                        long rj = arr[j][2];
                        // i -> j
                        double length = Math.sqrt((xi - xj) * (xi - xj) + (yi - yj) * (yi -yj));


                        if (length <= ri) {
                            motrix[i][j] = 1;
                        }
                        // j -> i
                        if (length <= rj) {
                            motrix[j][i] = 1;
                        }
                    }
                }

//              -------------  结束
//                todo 矩阵BFS
                int maxCount = 1;
                for (int start = 0; start < n; start++) {
                    boolean[] visited = new boolean[n]; // 判断是否出现过
                    visited[start] = true;
                    Queue<Integer> q = new LinkedList<>();
                    q.add(start);
                    int count = 1;
                    while (!q.isEmpty()) {
                        int cur = q.poll();
                        for (int next = 0; next < n; next++) {
                            if (visited[next] == false && motrix[cur][next] == 1) {
                                visited[next] = true;
                                q.add(next);
                                count++;
                            }
                        }
                    }
                    maxCount = Math.max(maxCount, count);
                }
                System.out.println(maxCount);

            }
        }
}
