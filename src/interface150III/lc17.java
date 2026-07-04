package interface150III;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author hc
 * @date
 **/
public class lc17 {
// todo
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        backStracking(digits, map, list, 0, new StringBuilder());
        return list;
    }
    private void backStracking(String digits
            , HashMap<String, String> map
            , List<String> list, int index
            , StringBuilder sb) {
        if (index == digits.length()) {
            list.add(sb.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            backStracking(digits, map, list, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
