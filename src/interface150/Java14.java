package interface150;

public class Java14 {

    public int[][] foundMonotoneStack (int[] nums) {
        // write code here
        int len = nums.length;
        int[][] res = new int[len][2];
        for (int i = 0; i < len; i++) {
            res[i][0] = -1;
            res[i][1] = -1;
        }
        // 有重复，没法Hash
        // 存暴力
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                res[i][0] = -1;
                // 查找左侧有无 小值
                for (int j = i + 1; j < len; j++) {
                    if (nums[j] < nums[i]) {
                        res[i][1] = j;
                        break;
                    }
                }
            } else if (i == len - 1) {
                res[i][1] = -1;
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[j] < nums[i]) {
                        res[i][0] = j;
                        break;
                    }
                }
            } else {
                for (int j = i + 1; j < len; j++) {
                    if (nums[j] < nums[i]) {
                        res[i][1] = j;
                        break;
                    }
                }

                for (int j = i - 1; j >= 0; j--) {
                    if (nums[j] < nums[i]) {
                        res[i][0] = j;
                        break;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,4,1,5,6,2,7};
        Java14 obj = new Java14();
        int[][] res = obj.foundMonotoneStack(nums);
    }
}
