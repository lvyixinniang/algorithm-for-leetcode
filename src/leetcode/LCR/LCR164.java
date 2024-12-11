package leetcode.LCR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LCR164 {

    public String crackPassword(int[] password) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : password) {
            if (i >= 0) list.add(i);
        }
        // 按照 首字母排序 ？ 15 《 7 《 8
        // 0 《 （ 30 《 3）？《 34 < 5 < 9
        // judge 0303 or 0330 max？
        // 排序方法
        // todo 未完成
        return "";
    }
}
