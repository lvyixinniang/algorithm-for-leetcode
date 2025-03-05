package interface150;

public class lc209 {

    public static  int minSubArrayLen(int target, int[] nums) {
        // 维护 一个 从l 到 r 的滑动窗口
        int len = nums.length;
        int l = 0;
        int sum = 0;
        int min = len + 1;
        for (int r = 0; r < len; r++) {
            sum += nums[r];
            // 如果 右边界大于 target ， 缩小左边界
            while (sum >= target) {
                if (r - l + 1 < min) {
                    min = r - l + 1;
                }
                sum -= nums[l];
                l ++;
            }
        }
        return min == len + 1 ? 0 : min;
    }
    public static void main(String[] args) {
//        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
//        System.out.println(minSubArrayLen(4, new int[]{1, 4, 4}));
//        System.out.println(minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));
        System.out.println(minSubArrayLen(7, new int[]{5}));
    }
}
