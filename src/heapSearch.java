import java.util.*;

/**
 * @author hc
 * @date
 **/
public class heapSearch {

    public static void main(String[] args) {
        int[] arr = {12,4,5,1,9,2};
        int random = 12; // 假设任意值
        heapSort(arr, random);
    }

    private static int heapSort(int[] arr, int random) {
        int len =  arr.length;
        for (int i = len/2 - 1; i >= 0; i--){
            heapify(arr, i, len);
        }


        //
        for (int i = len - 1; i >= 0; i--) {
            if (arr[0] == random) {
                return i;
            }
            swap(arr, i, 0);// 将最大值移到最后
            heapify(arr, 0, i);
        }

        return -1;
    }

    private static void heapify(int[] arr, int i, int len){
        int largest = i; // 最大值索引
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, len);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
