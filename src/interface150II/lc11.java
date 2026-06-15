package interface150II;

public class lc11 {

    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0, right = len -1;
        int maxArea = 0;

        while (left < right) {
            int currentWith  = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = currentWith * currentHeight;

            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
