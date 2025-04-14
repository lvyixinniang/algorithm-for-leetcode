package interface150;

public class Java1 {
    public static String longestCommonPrefix(String[] strs) {
        // write code here
        if (strs == null || strs.length == 0) return "";
        int index = 0;
        StringBuilder sb = new StringBuilder();
        boolean found = true;
        while (index < strs[0].length()) {
            char c = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || strs[i].charAt(index) != c) {
                    found = false;
                    break;
                }
            }
            if (!found) {
                return sb.toString();
            } else {
                sb.append(strs[0].charAt(index));
            }
            index ++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"abca","abc","abca","abc","abcc"}));
    }
}
