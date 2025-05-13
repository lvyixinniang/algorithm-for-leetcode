package interface150;



public class lc215 {
/*    // 堆排
    public int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length;
        buildMaxHeap(nums, heapSize);
        for (int i = nums.length - 1; i >= nums.length - k + 1; i--) {
            swap(nums,0,  i);
            heapSize--;
            maxHeapify(nums, 0, heapSize);
        }
        return nums[0];
    }

    private void buildMaxHeap(int[] a, int heapSize) {
        for (int i = heapSize / 2; i >= 0; i--) {
            maxHeapify(a, i, heapSize);
        }
    }

    private void maxHeapify(int[] a, int i, int heapSize) {
        int largest = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        if (l < heapSize && a[l] > a[largest]) {
            largest = l;
        }
        if (r < heapSize && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(a, largest, i);
            maxHeapify(a, largest, heapSize);
        }
    }


    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }*/

//    快排
    public int findKthLargest(int[] nums, int k) {
         int n = nums.length;
         return quickSelect(nums, 0, n - 1, n - k);
    }

    private int quickSelect(int[] nums, int l, int r, int k) {
        if (l == r) return nums[l];
        int x = nums[l], i = l - 1, j = r + 1;
        while (i < j) {
            do i ++; while (nums[i] < x);
            do j --; while (nums[j] > x);
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        if (k <= j) return quickSelect(nums, l, j - 1, k);//意味着第 k 小的元素在左分区 [l, j] 中
        else return quickSelect(nums, j + 1, r, k);
    }


    public static void main(String[] args) {
        lc215 lc = new lc215();
        System.out.println(lc.findKthLargest(new int[]{3,2,1,5,4}, 2));
    }
}
