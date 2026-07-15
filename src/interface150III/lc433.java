package interface150III;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hc
 * @date
 **/
public class lc433 {

    public int minMutation(String startGene, String endGene, String[] bank) {
        int len = bank.length;
        // 要求每次基因变化都必须出现在bank中
        Queue<String> queue = new LinkedList<>();
        boolean[] visited = new boolean[len];
        queue.offer(startGene);
        int count = 0;
        boolean isTrue = false;

        // 如果 startGene 在 bank 中，标记为已访问
        for (int i = 0; i < len; i++) {
            if (bank[i].equals(startGene)) {
                visited[i] = true;
                break;
            }
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String poll = queue.poll();
                for (int j = 0; j < len; j++) {
                    if (visited[j]) {
                        continue;
                    }

                    // 检测变化是否只有一个字符
                    boolean flag = judge(poll, bank[j]);
                    if (flag) {
                        visited[j] = true;//标志走过
                        queue.offer(bank[j]);

                        if (bank[j].equals(endGene)) {
                            isTrue = true;
                        }
                    }
                }
                count ++;
            }
        }
        return isTrue ? count : -1;
    }

    private boolean judge(String gene, String bank) {
        int len = bank.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (gene.charAt(i) != bank.charAt(i)) {
                count++;
            }
        }
        return count != 1 ? false : true;
    }
}
