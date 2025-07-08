package interface150II;

public class lc209 {

    public int minSubArrayLen(int target, int[] nums) {
//        todo 对于滑动窗口还是有些不熟
        int n = nums.length;
        int minSize = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                minSize = Math.min(minSize, right - left + 1);
                sum -= nums[left++];
            }
        }

        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
    public static void main(String[] args) {
        lc209 lc209 = new lc209();
        System.out.println(lc209.minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }
}
