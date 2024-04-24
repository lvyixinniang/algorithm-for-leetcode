package leetcode;

public class leetcode11_Array {
    public static void main(String[] args) {
        int[] height = new int[]{1,1};
        maxArea(height);
    }
    public static int maxArea(int[] height) {
        int len = height.length;
        int l=0,r=len-1;
        int ans =0;
        while(l<r){
            int area = Math.min(height[l] ,height[r]) *(r-l);
            ans = Math.max(ans , area);
            if(height[l] <= height[r]){
                ++l;
            }else {
                --r;
            }
        }

        return ans;
    }
}
