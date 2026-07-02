package huaweiOD;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author hc
 * @date
 **/
public class P00009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        if (n <= m) {
            System.out.println(arr[n - 1]);
            return;
        }

        // 最小堆
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 先将前m个最短罪业分配给m条流水线
        for (int i = 0; i < m; i++) {
            pq.offer(arr[i]);
        }

        // 处理剩余作业
        for(int i = m; i < n; i++) {
            int earliest = pq.poll();//最早空闲的流水线完成时间
            earliest += arr[i];
            pq.offer(earliest);
        }
        int totalTime = 0;
        while (!pq.isEmpty()) {
            totalTime = Math.max(totalTime, pq.poll());
        }
        System.out.println(totalTime);
    }
}
