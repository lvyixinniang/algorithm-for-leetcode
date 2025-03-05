package interface150;

public class lc11 {

    public static int maxArea(int[] height) {
        int maxx = 0;
        int low = 0 , high = height.length - 1;
        while (low < high) {
            int area = (high - low) * Math.min(height[low], height[high]);
            maxx = Math.max(maxx, area);
            if (height[low] < height[high]) {
                low ++;
            } else {
                high --;
            }
        }
        return maxx;
    }

    public static void main(String[] args) {
        maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }
}
