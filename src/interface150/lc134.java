package interface150;

public class lc134 {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        for (int g : gas) totalGas += g;
        int totalCost = 0;
        for (int c : cost) totalCost += c;

        if (totalGas < totalCost)
            return -1;

        int currentSum = 0, start = 0, index = 0;
        for (int i = 0; i < gas.length; i++) {
            currentSum += gas[i] - cost[i];
            if (currentSum < 0) {
                start = i + 1;
                currentSum = 0;
            }
        }
        return start % gas.length;
    }

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{3,3,3}, new int[]{5, 1, 1}));
    }
}
