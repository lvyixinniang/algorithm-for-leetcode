package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc167 {

    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            }else if (sum < target) {
                low++;
            }else if (sum > target) {
                high--;
            }
        }
        return new int[]{low + 1, high + 1};
    }
    public static void main(String[] args) {
        lc167 lc167 = new lc167();
        System.out.println(lc167.twoSum(new int[]{2,7,11,15}, 9));
    }
}
