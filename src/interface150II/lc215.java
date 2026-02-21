package interface150II;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_ADDPeer;

import java.util.PriorityQueue;
import java.util.Random;

public class lc215 {
//todo 堆排 + 快排
/*    public int findKthLargest(int[] nums, int k) {
        headpSort(nums);
        int n = nums.length;
        return nums[n - k];
    }*/

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,5,6,4};
        lc215 solution = new lc215();
        solution.findKthLargest(nums, 2);
        System.out.println(nums);
    }

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        quickSort(nums, n, k);
        return nums[n - k];
    }

    public void quickSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int pivotIndex = randomNum(nums, l, r);
        quickSort(nums, l, pivotIndex - 1);
        quickSort(nums, pivotIndex + 1, r);
    }

    private int randomNum(int[] nums, int l, int r) {
        Random rand = new Random();
        int randomNum = rand.nextInt(r - l + 1) + l;
        swap(nums, randomNum, r);
        return partition(nums,  l, r);
    }

    private int partition(int[] nums, int l, int r) {
        int pivot = nums[r];
        int i =   l - 1;

        for (int j = l; j < r; j++) {
            if (nums[j] < pivot) {
                i ++;
                swap(nums, i,j);
            }
        }

        swap(nums, ++i, r);
        return i;

    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
