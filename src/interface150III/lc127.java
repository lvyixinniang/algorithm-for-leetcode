package interface150III;

import java.util.*;

/**
 * @author hc
 * @date
 **/
public class lc127 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int n = wordList.size();
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        // 判断是否遍历过
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        int count = 1; // 修改1：初始化为1，包含beginWord
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String curWord = queue.poll();
                if (curWord.equals(endWord)) return count;
//                visited.add(curWord); // 删除此行，因为入队时已标记
                for (int j = 0; j < n; j++) {
                    String nextWord = wordList.get(j);
                    if (visited.contains(nextWord)) continue;
                    if (judge(curWord, nextWord)) {
                        visited.add(nextWord); // 修改2：入队时立即标记
                        queue.offer(nextWord);
                    }
                }
            }
            count++;
        }
        return 0;
    }

    private boolean judge(String curWord, String nextWord) {
        int len = curWord.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (curWord.charAt(i) != nextWord.charAt(i)) {
                count++;
            }
            if (count > 1) return false;
        }
        return true;
    }
}
