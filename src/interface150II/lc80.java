package interface150II;

public class lc80 {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 2) return len;
        int aim = 0;
        for (int i = 2; i < len; i++) {
            if (nums[i] != nums[i - 2]) {
                continue;
            }else {
                // 找到下一个不同的元素
                aim = i;
                for (int j = i; j < len; j++) {
                    if (nums[j] != nums[i]) {
                        aim = j;
                        break;
                    }
                }
                // 判断 aim 是不是最后一个元素了
                if(aim == i) {
                    return i;
                }
                // 进行替换，从（aim 到 len - 1）,全部替换到 （i，到len - （aim - i））
                int temp = i;
                for (int j = aim; j < len; j++) {
                    nums[temp++] = nums[j];
                }
                // 修改最终长度
                len -= (aim - i);
            }
        }
        return len;
    }

    public static void main(String[] args) {

        lc80 lc80 = new lc80();
        System.out.println(lc80.removeDuplicates(new int[]{1,1,1,1}));
    }
}
