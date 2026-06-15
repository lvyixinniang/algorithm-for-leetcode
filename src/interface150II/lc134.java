package interface150II;

public class lc134 {

        // todo 待重做 2025/7/4 2025/7/19(重做不会） 9/6日重做 10/10 重做 2026/4/10重做
    public int canCompleteCircuit(int[] gas, int[] cos) {
        int len = gas.length;
        int sum = 0;
        int currSum = 0;
        int start = 0;

        for (int i = 0; i < len; i++) {
            currSum = currSum + gas[i] - cos[i];
            sum += gas[i] - cos[i];
            if (currSum < 0) {
                start = i + 1;
                currSum = 0;
            }
        }
        return sum < 0 ? -1 : start;
    }


    public static void main(String[] args) {
        lc134 lc134 = new lc134();
        System.out.println(lc134.canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}));
    }
}
