package interface150II;

import java.util.HashMap;
import java.util.Map;

public class lc167 {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int len = numbers.length;

        while (left < right) {
            if (target == numbers[left] + numbers[right]) {
                return new int[]{left + 1, right + 1};
            } else if (target > numbers[left] + numbers[right]) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        lc167 lc167 = new lc167();
        System.out.println(lc167.twoSum(new int[]{2,7,11,15}, 9));
    }
}
