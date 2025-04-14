package interface150;

import java.util.Arrays;

public class Java13 {

    public int MoreThanHalfNum_Solution (int[] numbers) {
        // write code here
        // 不是 位运算
        Arrays.sort(numbers);
        int size = numbers.length;
        int target = numbers[size / 2];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }
        return count >= size / 2 ? target : 0;
    }
}
