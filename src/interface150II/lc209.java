package interface150II;

public class lc209 {


//        todo 对于滑动窗口还是有些不熟 2025/7/19（重做不会） 10/11重做不会
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum < target) {
            return 0;
        }

        int left = 0;
        int minlen = len;
        sum = 0;
        for (int right = 0; right < len; right++) {
            sum += nums[right];
            if (sum >= target) {
                // 移动左指针
                while(left <= right && sum >= target) {
                    minlen = Math.min(minlen, right - left + 1);
                    sum -= nums[left++];
                }
            }
        }
        return minlen = minlen;
    }

    public static void main(String[] args) {
        lc209 lc209 = new lc209();
        System.out.println(lc209.minSubArrayLen(5, new int[]{2,3,1,1,1,1}));
    }
}
