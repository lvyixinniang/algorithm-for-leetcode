package Code_Capriccio.HashTable;

public class lc383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "ab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] board = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            board[c - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (board[c - 'a'] > 0) {
                board[c - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }
}
