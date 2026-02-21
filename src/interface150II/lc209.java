package interface150II;

public class lc209 {


//        todo 对于滑动窗口还是有些不熟 2025/7/19（重做不会） 10/11重做不会
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minlen = nums.length + 1;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minlen = Math.min(minlen, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minlen == nums.length + 1 ? 0 : minlen;
    }

    public static void main(String[] args) {
        lc209 lc209 = new lc209();
        System.out.println(lc209.minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }
}
