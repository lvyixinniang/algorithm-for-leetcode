package interface150II;

public class lc134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        // todo 待重做 2025/7/4 2025/7/19(重做不会）
        // 贪心
        int totalTank = 0;      // 总油量盈余
        int currTank = 0;       // 当前油量盈余
        int startStation = 0;   //起点加油站索引

        for (int i = 0; i < gas.length; i++) {
            int net = gas[i] - cost[i]; // 当前站点 净收益油量
            totalTank += net;
            currTank += net;

            if (currTank < 0) {
                startStation = i + 1;
                currTank = 0;
            }
        }
        return totalTank >= 0 ? startStation : -1;
    }

    public static void main(String[] args) {
        lc134 lc134 = new lc134();
        System.out.println(lc134.canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}));
    }
}
