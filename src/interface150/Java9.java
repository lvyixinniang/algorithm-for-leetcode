package interface150;

import java.util.ArrayList;
import java.util.List;

public class Java9 {

    public double[] flowmedian (int[][] operations) {
        // write code here
        int n = operations.length;
        List<Integer> list = new ArrayList<>();
        List<Double> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (operations[i][0] == 1) {
                list.add(operations[i][1]);
                list.sort(Integer::compare);
            }
            else if (operations[i][0] == 2) {
                int size = list.size();
                if (size % 2 == 0) {
                    // 是双数
                    int x = list.get(size / 2);
                    int y = list.get(size / 2 - 1);
                    res.add((y - x) / 2.0);
                }else {
                    int x = list.get(size / 2);
                    res.add(Double.valueOf(x));
                }
            }
        }
        double[] resArr = new double[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArr[i] = res.get(i);
        }
        return resArr;
    }
}
