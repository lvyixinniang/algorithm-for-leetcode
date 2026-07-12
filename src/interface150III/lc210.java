package interface150III;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author hc
 * @date
 **/
public class lc210 {

/*    // BFS （拓扑排序）
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
        int[] indegree = new int[numCourses];
        for (int[] prer : prerequisites) {
            graph.get(prer[1]).add(prer[0]);
            indegree[prer[0]] ++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }

        int[] res = new int[numCourses];
        int count = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            res[count++] = cur;
            for (int neighbor : graph.get(cur)) {
                indegree[neighbor] --;
                if (indegree[neighbor] == 0) queue.offer(neighbor);
            }
        }
        return count != numCourses ? new int[]{} : res;
    }*/

//    DFS(检测环）
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
        }

        List<Integer> res = new ArrayList<>();
        int[] visited = new int[numCourses];

        int count = 0;
        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(graph, visited, i, res)) {
                return new int[0];
            }
        }

        int[] ans  = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            ans[i] = res.get(numCourses - 1 - i);
        }
        return ans;
    }

    private boolean hasCycle(List<List<Integer>> graph
            , int[] visited, int cur, List<Integer> res) {
        if (visited[cur] == 1) return true; // 有环
        if (visited[cur] == 2) return false; // 走过的，当前无环
        visited[cur] = 1; // 判断当前节点是否有环
        for (Integer i : graph.get(cur)) {
            if (hasCycle(graph, visited, i, res)) {
                return true;
            }
        }
        visited[cur] = 2;
        res.add(cur);
        return false;
    }
}
