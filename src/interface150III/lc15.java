package interface150III;

import java.util.*;

/**
 * @author hc
 * @date
 **/
public class lc15 {

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < n; k++) {
            int i = k + 1, j = n - 1;
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            while (i < j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (i < j && nums[i] == nums[i + 1]) i++;
                    while (i < j && nums[j] == nums[j - 1]) j--;
                    i++;
                    j--;
                } else if (sum > 0) {
                    j --;
                } else {
                    i ++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc15 lc15 = new lc15();
        System.out.println(lc15.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
