package PDD2025;

import java.util.Scanner;

public class thrid {

    public static void main(String[] args) {
//        todo 其实就是一个左右前缀和
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        预处理 左递增调整 （0 ~ i）
        long[] L = new long[n]; // 改变后的
        long[] leftCost = new long[n]; // 需要加的值的大小
        L[0] = arr[0];
        leftCost[0] = 0;
        for (int i = 1; i < n; i++) {
            long add = Math.max(0, L[i - 1] + 1 - arr[i]);
            L[i] = arr[i] + add; // 更改递增序列
            leftCost[i] = leftCost[i - 1] + add;  // 前缀和
        }

//        预处理 有递减 （i~n-1的递减）
        long[] R = new long[n];
        long[] rightCost = new long[n];
        R[n - 1] = arr[n - 1];
        rightCost[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            long add = Math.max(0, L[i + 1] + 1 - arr[i]);
            R[i] = arr[i] + add;
            rightCost[i] = (i == n - 2) ? add : rightCost[i + 1];
        }

        long minCost = Long.MAX_VALUE;
        // 枚举峰值
        for (int mid = 1; mid <= n - 1; mid++) {
            // 左边部分递增代价 （0 到mid-1）
            long leftSum = leftCost[mid - 1];
            long rightSum = rightCost[mid + 1];

            // 峰值操作 使得arr[mid]大于左右令居
            long midAdd = Math.max(0, Math.max(L[mid-1], R[mid+1]) + 1 - arr[mid]);
            long totalCost = leftSum + rightSum + midAdd;
            minCost = Math.min(minCost, totalCost);
        }
        System.out.println(minCost);
    }
}
