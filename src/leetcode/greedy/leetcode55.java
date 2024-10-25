package leetcode.greedy;

public class leetcode55 {
    public static void main(String[] args) {
        canJump(new int[]{3,2,1,0,4});
    }

    public static  boolean canJump(int[] nums) {
        int len = nums.length;
//        每次的起跳点
        int index = 0;
        while (true) {
//            最佳起跳点
            int maxIndex = 0;
//            最大能到达的地点
            int max = 0;
            for (int i = index + 1; i <= index + nums[index] && i < len; i++) {
                if (max <= i + nums[i]) {
                    maxIndex = i;
                    max = maxIndex + nums[maxIndex];
                }
            }
            if (max >= len - 1) {
                return true;
            }
            if (maxIndex == 0) {
                return false;
            }
            index = maxIndex;
        }
    }
}
