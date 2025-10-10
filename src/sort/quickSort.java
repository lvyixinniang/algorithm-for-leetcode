package sort;

public class quickSort {
// todo 快排，害得练
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,32,5,6,3,2135,34,76,8,0,43};
        quicksort(arr,0, arr.length - 1);
    }

    private static void quicksort(int[] arr, int l, int r) {
        if (l >= r) return;
        int pivotIndex = sort(arr, l, r);
        quicksort(arr, l, pivotIndex - 1);
        quicksort(arr, pivotIndex + 1, r);
    }

    private static int sort(int[] arr, int l, int r) {
        int pivotNum = arr[l];
        int i = l + 1;
        int j = r;

        while (i <= j) {
            while (i <= j && arr[i] <= pivotNum) {
                i ++;
            }
            while (i <= j && arr[j] >= pivotNum) {
                j --;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
