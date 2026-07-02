package interface150III;

/**
 * @author hc
 * @date
 **/
public class lc134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum +=  gas[i] - cost[i];
        }
        if (sum < 0) {
            return -1;
        }

        int start = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += gas[i] - cost[i];
            if (curr < 0) {
                start = i + 1;
                curr = 0;
            }
        }
        return start;
    }

}
