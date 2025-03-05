package interface150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc17 {
    Map<Integer, Character[]> map = new HashMap<Integer, Character[]>(){
        {put(2, new Character[]{'a','b','c'});}
        {put(3, new Character[]{'d','e','f'});}
        {put(4, new Character[]{'g','h','i'});}
        {put(5, new Character[]{'j','k','l'});}
        {put(6, new Character[]{'m','n','o'});}
        {put(7, new Character[]{'p','q','r','s'});}
        {put(8, new Character[]{'t','u','v'});}
        {put(9, new Character[]{'w','x','y','z'});}
    };
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;
        stracking(res, digits, 0, new StringBuilder());
        return res;
    }

    private void stracking(List<String> res, String digits, int index, StringBuilder sb) {
       if (index == digits.length()) {
           res.add(sb.toString());
       } else {
            int digit = digits.charAt(index) - '0';
           Character[] characters = map.get(digit);
           for (int i = 0; i < characters.length; i++) {
               sb.append(characters[i]);
               stracking(res, digits, index + 1, sb);
               sb.deleteCharAt(sb.length() - 1);
           }
       }
    }


    public static void main(String[] args) {
        lc17 lc17 = new lc17();
        System.out.println(lc17.letterCombinations(""));
    }
}
