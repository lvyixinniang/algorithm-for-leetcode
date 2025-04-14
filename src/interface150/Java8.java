package interface150;

import java.util.ArrayList;

public class Java8 {

    public ArrayList<Integer> GetLeastNumbers_Solution (int[] input, int k) {
        // write code here
        // 找到最小的 四个数 ，
        // 快速排序
        if (input.length == 0) return new ArrayList<>();
        quickSort (input, 0, input.length - 1);
        ArrayList<Integer> res = new ArrayList<>();
        k = k % input.length;
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }

    private void quickSort(int[] input, int left, int right) {
        // 基准元素
        int pivot = input[left];
        int index_pivot = searchPivot(input, left, right);
        // 左快排
        quickSort(input, left, index_pivot - 1);
        // 又快拍
        quickSort(input, index_pivot + 1, right);
    }

    private int searchPivot(int[] input, int left, int right) {
        int pivot = input[left];
        for (int i = left + 1; i < right; i++) {
            if (pivot < input[i]) {
                int temp = input[i];

            }
        }
return pivot;
    }
}
