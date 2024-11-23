package Code_Capriccio.Recall;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc131 {
    static List<List<String>> res = new ArrayList<>();
    static List<String> path = new ArrayList<>();
    public static List<List<String>> partition(String s) {
        backTracking (s, 0);
        return res;
    }

    private static void backTracking(String s, int startIndex) {
        if (startIndex == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (judge(s, startIndex, i)) {
                path.add(s.substring(startIndex, i + 1));
                backTracking(s, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }


    // 判断是否为回文数
    private static boolean judge(String s, int startIndex, int endIndex) {
        for (int i = startIndex, j = endIndex ; i < j; i++, j --) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(partition("aac"));
    }
}
