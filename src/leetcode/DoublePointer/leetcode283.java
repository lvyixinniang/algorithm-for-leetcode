package leetcode.DoublePointer;

public class leetcode283 {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes(int[] nums) {
/*        int l = 0 , r = 0;
//        我知道nums[l]==0 , 并且nums[r]!=0时,交换
//        难点在于,如何让 l 移动到下标为 0 , r 移动到下标不是 0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                l = i;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        r = j;
                        swap(nums,l,r);
                        break;
                    }
                }
                continue;
            }
        }
        return ;*/

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (index < i) {
                nums[index] = nums[i];
            }
            index ++;
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    public static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
