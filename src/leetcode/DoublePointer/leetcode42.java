package leetcode.DoublePointer;

public class leetcode42 {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
    public static int trap(int[] height) {
        int sum = 0;
        int n = height.length;
        int l = 0 , r = 0;
        for (int i = 0; i < n - 1; i++) {
            if (height[i] != 0) {
                 l = i;
                 r = l + 1;
                 while (r < n){
                     if (height[r] != 0){
                         break;
                     }
                     r ++;
                 }
                 sum = sum + (r - l - 1)*Math.abs(height[l] - height[r]);
                 l = r;
            }
        }

        return sum;
    }
}
