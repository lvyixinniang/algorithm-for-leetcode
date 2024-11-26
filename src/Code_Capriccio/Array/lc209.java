package Code_Capriccio.Array;

public class lc209 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        // 双指针
        int sum = 0, left = 0 , right = 0;
        int min = Integer.MAX_VALUE;
        while (true) {
            if (min == 1) break;
            if (sum == target) {
                min = Math.min(min, right - left);
                sum -= nums[left ++];
            } else if (sum < target) {
                if (right == nums.length) break;
                sum += nums[right ++];
            } else {
                sum -= nums[left ++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
