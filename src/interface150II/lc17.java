package interface150II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc17 {
    private Map<Character, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if (digits.length() == 0) {return res;}
        backTrace(map, digits, res, 0, sb);
        return res;
    }

    private void backTrace(Map<Character, String> map, String digits, List<String> res, int index, StringBuilder sb) {
        if (sb.length() == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String str = map.get(digits.charAt(index));
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            backTrace(map, digits, res, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        lc17 lc17 = new lc17();
        System.out.println(lc17.letterCombinations("23"));
    }
}
