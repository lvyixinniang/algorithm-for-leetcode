public class leetcode22209 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
//        TODO 小红书面试 待解决
        int res = 0;
//        双指针
        int left = 0, right = 0;
        int len = nums.length;
        int sum = nums[0];
        int min = len;
        int he =0 ;
        for (int num : nums) {
            he += num;
        }
        if (he < target) return 0;

        for (;left <= right && right < len; ){
            if (left == right && left == len -1) break;
            if (sum < target) {
                sum += nums[right];
                if (right + 1 != len ) right ++;
            }
            if (sum >= target) {
                sum -= nums[left];
                min = Math.min(min, right - left + 1);
                if (left + 1 != len ) left ++;
            }
        }

        return min;
    }
}
