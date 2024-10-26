package leetcode.greedy;

public class leetcode45 {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 3, 1}));
    }
    public static int jump(int[] nums) {
        int counter = 0; // 计数器
        int len = nums.length;
        int index = 0; // 每次的起跳点

        while (index < len - 1) {
            int max = 0;
            int maxIndex = index;
            int i ;
            for (i = index; i <= Math.min(index + nums[index], len - 1); i++) {
                if (max <= i + nums[i]) {
                    maxIndex = i;
                    max = maxIndex + nums[maxIndex];
                }
                if (nums[index] >= len - 1) break;
            }
            counter ++;
            if (max >= len - 1) {
                if (maxIndex > index) counter ++;
                break;
            }
            if (maxIndex == 0) {
                return -1;
            }
            index = maxIndex;
        }
        return counter;
    }
}
