package interface150II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc17 {
    private Map<Character, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        StringBuilder sb = new StringBuilder();
        backTracing(res, digits, 0, sb);
        return res;
    }

    private void backTracing(List<String> res, String digits, int start, StringBuilder sb) {
        if (start == digits.length()) {
            res.add(sb.toString());
        }
        char c = digits.charAt(start);
        String letter = map.get(c);
        for (int i = 0; i < letter.length(); i++) {
            sb.append(c);
            backTracing(res, digits, start + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        lc17 lc17 = new lc17();
        System.out.println(lc17.letterCombinations("23"));
    }
}
