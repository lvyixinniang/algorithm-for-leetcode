package Code_Capriccio.HashTable;

import java.util.*;

public class lc15 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return res;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (right > left) {
                if (nums[i] + nums[left] + nums[right] > 0) right --;
                else if (nums[i] + nums[left] + nums[right] < 0) left ++;
                else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    while (right > left && nums[right] == nums[right - 1]) right -- ;
                    while (right > left && nums[left] == nums[left + 1]) left ++;
                    right --;
                    left ++;
                }
            }
        }

        return res;
    }
}
