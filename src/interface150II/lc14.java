package interface150II;

public class lc14 {

    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            boolean flag = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i ) {
                    flag = false;
                    break;
                }
                if ( strs[j].charAt(i) != c) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                sb.append(c);
            } else {
                break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        lc14 lc14 = new lc14();
        System.out.println(lc14.longestCommonPrefix(new String[]{"ab","a"}));
    }
}
