package sort;

public class heapSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 24, 31, 25, 11};
        headpSort(arr);
    }

    private static void headpSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        int n = arr.length;

        // 构建最大堆：从最后非叶子节点开始调整
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 2.逐个提取栈顶元素：将最大值交换到末尾
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // 左子结点存在大于根节点
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // 右子节点存在大于根节点
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // 如果根节点不是最大值，递归交换
        if (largest != i) {
            swap(arr, largest, i);
            heapify(arr, n, largest);
        }
    }

}
