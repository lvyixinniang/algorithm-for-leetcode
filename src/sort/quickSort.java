package sort;

public class quickSort {
// todo 快排，害得练
    public static void main(String[] args) {
        int[] arr = new int[]{6,2,8,5,1,9,4,3,7};
        quickSort(arr,0, arr.length - 1);
    }

    // 快速排序入口函数
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivotIndex = pivot(arr, left, right);

        quickSort(arr, left, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, right);
    }

    public static int pivot(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
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
