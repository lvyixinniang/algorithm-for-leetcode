package interface150;

import java.util.*;

public class lc15 {

    public static  List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < len - 2; i++) {
            int l = i + 1, r = len - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l ++;
                    r --;
                } else if (sum < 0) {
                    l ++;
                } else {
                    r --;
                }

            }
        }
        for (List<Integer> integers : set) {
            res.add(integers);
        }

        return res;
    }

    public static void main(String[] args) {
//        threeSum(new int[]{-1, 0, 1, 2, -1, -4});
//        threeSum(new int[]{0,0,0,0});
        threeSum(new int[]{-2,0,1,1,2});
    }
}
