package sort;

public class heapSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 24, 31, 25, 11};
        headpSort(arr);

    }

    public static void headpSort(int[] nums) {
        int n = nums.length;

        // 从最后一个非叶子结点
        for (int i = n / 2 - 1; i >= 0; i --) {
            heapify(nums, n, i);
        }

        // 2. 逐个从堆顶取出最大元素， 放到数组末尾
        for (int i = n - 1; i > 0; i--) {
            swap(nums, 0, i);

            heapify(nums, i, 0);
        }
    }

    private static void heapify(int[] nums, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && nums[left] > nums[largest]) {
            largest = left;
        }

        if (right < n && nums[right] > nums[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap (nums, largest, i);

            heapify(nums, n, largest);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
