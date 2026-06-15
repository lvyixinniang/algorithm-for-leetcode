package sort;

import java.util.Random;

public class quickSort {
// todo 快排，害得练
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(arr);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left , right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        Random random = new Random();
        int pivotIndex = random.nextInt(right - left + 1) + left;
        swap(arr, pivotIndex, right);
        int pivot = arr[right];

        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i ++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
