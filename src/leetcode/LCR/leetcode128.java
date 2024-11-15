package leetcode.LCR;

public class leetcode128 {

    public int inventoryManagement(int[] stock) {
        int minn = Integer.MAX_VALUE;
        for (int i : stock) {
            if (i < minn) minn = i;
        }
        return minn;
    }
}
