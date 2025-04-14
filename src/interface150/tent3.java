package interface150;

import java.util.*;

public class tent3 {

    public ArrayList<Integer> GetLeastNumbers_Solution (int[] input, int k) {
        // write code here
        Arrays.sort(input);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }

    // 快速排序
    private void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        // 找到基准索引
        int pivotIndex = partition(arr, left, right);
        // 做递归
        quickSort(arr, left, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, right);
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left]; // 选择基准元素
        // 将元素分开
        int i = left, j = right;
        while (i < j) {
            while (i < j && arr[j] >= pivot) {
                j --;
            }
            if (i < j) {
                arr[i] = arr[j];
                i ++;
            }
            while (i < j && arr[i] <= pivot) {
                i ++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j --;
            }
        }
        arr[i] = pivot;
        return i;
    }

    // 归并排序
    private void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        // 递归左半部分
        mergeSort(arr, left, mid);
        // 递归右半部分
        mergeSort(arr, mid + 1, right);
        // 合并两个有序数组
        merge(arr, left, mid , right);
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1]; // 临时数组
        int i = left, j = mid + 1, k = 0;
        // 合并两个有序数组
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // 将剩余部分 复制到 temp
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        tent3 obj = new tent3();
//        obj.quickSort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr)); // 输出 [1, 2, 3, 4, 5, 6, 7, 8]
        obj.mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
