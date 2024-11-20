package leetcode.LCR.recall;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_ADDPeer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class leetcode157 {
    // todo 太强了， 多学习
    static List<String> res = new LinkedList<>();
    static char[] charArray;
    public static String[] goodsOrder(String goods) {
        charArray = goods.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    private static void dfs(int x) {
        if (x == charArray.length - 1) {
            res.add(String.valueOf(charArray));
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < charArray.length; i++) {
            if (set.contains(charArray[i])) continue;
            set.add(charArray[i]);
            swap(i, x);
            dfs(x + 1);
            swap(i, x);// 回溯，恢复原数组
        }
    }
    private static void swap(int i , int x) {
        char tmp = charArray[i];
        charArray[i] = charArray[x];
        charArray[x] = tmp;
    }

    public static void main(String[] args) {
        System.out.println(goodsOrder("abb"));
    }
}
