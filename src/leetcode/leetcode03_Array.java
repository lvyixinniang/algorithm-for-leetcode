package leetcode;

import java.util.*;

public class leetcode03_Array {
    public int lengthOfLongestSubstring(String s) {
        // 记录字符是否出现过 (即 散列表 )
        Set<Character> set = new HashSet<Character>();
        int n = s.length();
//      rk为右指针,初始值为 -1 , 相当于我们在字符串的左边界的左测,还没开始移动
        int rk = -1 , ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                // 每次从不同的i开始计算
                set.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !set.contains(s.charAt(rk + 1))) {
                // 移动右指针
                set.add(s.charAt(rk + 1));
                rk++;
            }
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
