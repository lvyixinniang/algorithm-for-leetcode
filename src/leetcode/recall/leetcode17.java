package leetcode.recall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class leetcode17 {
//    todo 想不到， 做不到
    private Map<Character, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() == 0) return list;
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
//        回溯
        char[] charArray = digits.toCharArray();
        process(list, charArray, 0, new StringBuffer());
        return list;
    }

    private void process(List<String> list, char[] charArray, int index, StringBuffer str) {
        if (index == charArray.length) {
            list.add(new String(str));
        } else {
            char digit = charArray[index];
            String letters = map.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                str.append(letters.charAt(i));
                process(list, charArray, index + 1 , str);
                str.deleteCharAt(index);
            }
        }
    }
}
