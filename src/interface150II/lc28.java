package interface150II;

public class lc28 {

    public int strStr(String haystack, String needle) {
        // 滑动窗口
        int lenH = haystack.length();
        int lenN = needle.length();
        if (lenH < lenN) return -1; // 后者长度大于前者， 不存在这种包换可能
        else if (lenH == lenN) return haystack.equals(needle) ? 0 : -1;
        for (int i = 0; i <= lenH - lenN; i++) {
            String sub = haystack.substring(i, i + lenN);
            if (sub.equals(needle)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        lc28 lc28 = new lc28();
        System.out.println(lc28.strStr("abc", "c"));
    }
}
