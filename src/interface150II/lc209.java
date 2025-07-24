package interface150II;

public class lc209 {

    public int minSubArrayLen(int target, int[] nums) {
//        todo 对于滑动窗口还是有些不熟 2025/7/19（重做不会）
        int len = nums.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < len; right++) {
            sum += nums[right];
            while (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    public static void main(String[] args) {
        lc209 lc209 = new lc209();
        System.out.println(lc209.minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }
}
