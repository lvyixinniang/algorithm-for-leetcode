package interface150;

public class lc189 {

    public static void rotate(int[] nums, int k) {
        // 方法一
/*        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArr[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            nums[i] = newArr[i];
        }*/

        // 方法二
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k , nums.length - 1);
        System.out.println(1);
    }

    private static void reverse(int[] nums, int fir, int las) {
        for (; fir < las; fir++, las --) {
            int temp = nums[fir];
            nums[fir] = nums[las];
            nums[las] = temp;
        }
    }

    public static void main(String[] args) {
        rotate(new int[]{1,2}, 2);
    }
}
