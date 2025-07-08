package interface150II;

public class lc58 {

    public int lengthOfLastWord(String s) {
        int len = s.length();
        int size = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1 && s.charAt(len - 1) == ' ') {
                // 字符串末尾 是 空格
                while (s.charAt(i) == ' ') {
                    i--;
                }
            }
                if (s.charAt(i) == ' ') {
                    break;
                }
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        lc58 lc58 = new lc58();
        System.out.println(lc58.lengthOfLastWord("   fly me   to   the moon  "));
    }
}
