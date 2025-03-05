package interface150;

public class lc153 {

    public int findMin(int[] nums) {
        int len = nums.length;
        int l = 0, r = len - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        lc153 obj = new lc153();
//        System.out.println(obj.findMin(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
//        System.out.println(obj.findMin(new int[]{5,6,7, 1, 2, 3, 4}));
//        System.out.println(obj.findMin(new int[]{4,5,6,7,0,1,2}));
        System.out.println(obj.findMin(new int[]{5,1,2,3,4}));
    }
}
