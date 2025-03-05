package interface150;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc139 {

    public static  boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<String>();
//        wordDict.add("apple");
//        wordDict.add("app");
//        wordBreak("appleappapple", wordDict);

        wordDict.add("apple");
        wordDict.add("pen");
        System.out.println(wordBreak("applepenapple", wordDict));

//        wordDict.add("cats");
//        wordDict.add("dog");
//        wordDict.add("sand");
//        wordDict.add("and");
//        wordDict.add("cat");
//        System.out.println(wordBreak("catsandog", wordDict));
    }
}
