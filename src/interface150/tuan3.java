package interface150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tuan3 {
    public int LastRemaining_Solution (int n, int m) {
        // write code here
        if (n < 1 || m < 1) return -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = 0;
        while (list.size() > 1) {
            int x = m % list.size();
            index = (index + x + list.size() - 1) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        tuan3 t = new tuan3();
        System.out.println(t.LastRemaining_Solution(5, 3));
    }
}
