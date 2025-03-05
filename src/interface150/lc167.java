package interface150;

public class lc167 {

    public static  int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        twoSum(new int[]{3,24,50,79,88,150,345}, 200);
    }
}
