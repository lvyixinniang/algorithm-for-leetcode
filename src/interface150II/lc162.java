package interface150II;

public class lc162 {

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        lc162 l = new lc162();
        System.out.println(l.findPeakElement(new int[]{1,2,3,1}));
    }
}
