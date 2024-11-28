package Code_Capriccio.HashTable;

import java.util.*;

public class lc18 {
    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }
        public static List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > target) break;
                if (i > 0 && nums[i - 1] == nums[i]) continue;
                if (nums.length < i + 4) break;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums.length < j + 3) break;
                    int left = j + 1;
                    int right = nums.length - 1;
                    while (left < right) {
                        long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum < target) left ++;
                        else if (sum > target) right --;
                        else {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[left]);
                            list.add(nums[right]);
                            res.add(list);

                            while (left < right && nums[right - 1] == nums[right]) right --;
                            while (left < right && nums[left + 1] == nums[left]) left ++;
                            left ++;
                            right --;
                        }
                    }
                }
            }
            Set<List<Integer>> set = new HashSet<>();
            for (List<Integer> row : res) {
                set.add(row);
            }
            res = new ArrayList<>();
            for (List<Integer> integers : set) {
                res.add(integers);
            }
            return res;
        }
}
