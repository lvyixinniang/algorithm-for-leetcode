package interface150III;

/**
 * @author hc
 * @date
 **/
public class lc11 {

    public int maxArea(int[] height) {
        int len = height.length;
        int l = 0, r = len - 1;
        int h = height[l] > height[r] ? height[r] : height[l];
        int size = (r -l) * h;

        while (l < r) {
            size = Math.max(size, (r - l) * h);
            if (height[l] < height[r]) {
                l ++;
            } else {
                r --;
            }
            h = height[l] > height[r] ? height[r] : height[l];
        }
        return size;
    }

    public static void main(String[] args) {
        lc11 lc11 = new lc11();
        System.out.println(lc11.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
