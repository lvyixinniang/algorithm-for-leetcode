package interface150II;

public class lc134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        // todo 待重做 2025/7/4
        int gasSum = 0, current = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            gasSum += gas[i] - cost[i]; // 总油量
            current += gas[i] - cost[i]; // 当前累计量
            if (current < 0) {  // 当前路径不对
                start = i + 1;
                current = 0;
            }
        }
        return gasSum >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        lc134 lc134 = new lc134();
        System.out.println();
    }
}
