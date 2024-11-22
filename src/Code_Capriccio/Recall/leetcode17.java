package Code_Capriccio.Recall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode17 {
    static List<String> res = new ArrayList<>();
    static HashMap<Character, char[]> map = new HashMap<>();
    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return res;
        char[] charArray = digits.toCharArray();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d','e','f'});
        map.put('4', new char[]{'g','h','i'});
        map.put('5', new char[]{'j','k','l'});
        map.put('6', new char[]{'m','n','o'});
        map.put('7', new char[]{'p','q','r','s'});
        map.put('8', new char[]{'t','u','v'});
        map.put('9', new char[]{'w','x','y','z'});
        backTracking (charArray, 0, 0, "");
        return res;
    }

    private static void backTracking(char[] charArray, int startIndex, int index, String s) {
        if (s.length() == charArray.length) {
            res.add(s);
            return;
        }
        char[] chars = map.get(charArray[startIndex]);

        for (int j = index; j < chars.length; j++) {
            // 选择
            s += chars[j];
            if (s.length() == startIndex + 1)
                backTracking(charArray, startIndex + 1, 0, s);
            else
                backTracking(charArray, startIndex + 1, j + 1, s);
            s = s.substring(0, s.length() - 1);
            if (j == -1) j = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }
}
