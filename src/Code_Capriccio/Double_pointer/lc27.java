package Code_Capriccio.Double_pointer;

public class lc27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0, right = 0;
        for (left = 0; left < n; left++) {
            if (nums[left] == val) {
                for (right  = left + 1; right <= n; right++) {
                    if (right == n) return left;
                    if (nums[right] != val) {
                        break;
                    }
                }
            }
            // swap
            int num = nums[left];
            nums[left] = nums[right];
            nums[right] = num;
        }
        return left;
    }
}
