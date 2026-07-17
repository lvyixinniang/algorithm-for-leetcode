package interface150III;

/**
 * @author hc
 * @date
 **/
public class lc875 {
//todo 整数溢出 导致除数为0了
    public int minEatingSpeed(int[] piles, int h) {
        long max = 0;
        long sum = 0;
        for (int i = 0; i < piles.length; i++) {
            sum += piles[i];
            max = Math.max(max, piles[i]);
        }

        long min = (sum + h - 1) / h;//向上取整
//        int min = Math.floorDiv(sum , h);
        while (min < max) {
            long mid = min + (max - min) / 2;
            int count = 0;
            for (int i = 0; i < piles.length; i++) {
                count += (piles[i] + mid - 1) / mid;//向上取整
            }
            if (count > h) {
                min = mid + 1;
            }else {
                max = mid;
            }
        }
        return (int)min;
    }

    public static void main(String[] args) {
        lc875 obj = new lc875();
        System.out.println(obj.minEatingSpeed(new int[]{805306368,805306368,805306368}, 1000000000));
    }
}
