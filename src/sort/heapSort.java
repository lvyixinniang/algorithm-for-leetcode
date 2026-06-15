package sort;

public class heapSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        heapSort(arr);
        System.out.println( arr);
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;
//        2*n +2
        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);//将当前最大的交换到队列末尾
            heapify(arr, 0, i);
        }
    }

    public static void heapify(int[] arr, int i, int n) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            // 调节子树的
            heapify(arr, largest, n);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
