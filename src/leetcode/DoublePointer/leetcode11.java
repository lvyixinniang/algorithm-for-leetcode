package leetcode.DoublePointer;

public class leetcode11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{2, 3, 4, 5, 18, 17, 6}));
    }
    public static int maxArea(int[] height) {
        int n = height.length;
        if (n == 2){
            return S(height,0,1);
        }

        int l = 0, r = n -1;
        int maxs = S(height,l,r);;
        for (int i = 0; i < n && l < r; i++) {
           if (height[l] < height[r]){
               l++;
           }else {
               r --;
           }
            maxs = Math.max(maxs,S(height,l,r));
        }

        return maxs;
    }
    public static int S(int[] height, int l ,int r){
        return Math.min(height[l],height[r])*(r - l);
    }
}
