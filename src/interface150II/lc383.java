package interface150II;

public class lc383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransom = new int[26];
        int[] maga = new int[26];
        int rlen = ransomNote.length();
        int mlen = magazine.length();
        for (int i = 0; i < rlen; i++) {
            ransom[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < mlen; i++) {
            maga[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (ransom[i] > maga[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lc383 lc383 = new lc383();
        System.out.println(lc383.canConstruct("aa", "aab"));
    }
}
