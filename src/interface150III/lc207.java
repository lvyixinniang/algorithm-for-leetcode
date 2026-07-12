package interface150III;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author hc
 * @date
 **/
public class lc207 {

/*//    DFS(检测环）
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
        }
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(graph, visited, i)) return false;
        }
        return true;
    }

    private boolean hasCycle(List<List<Integer>> graph
            , int[] visited, int node) {
        if (visited[node] == 1) return true; // 发现环
        if (visited[node] == 2) return false; // 已访问过，无环
        visited[node] = 1; // 标记正在访问
        for (int neighbor : graph.get(node)) {
            if (hasCycle(graph, visited, neighbor)) return true;
        }
        visited[node] = 2; // 标记已访问
        return false;
    }*/

//    BFS（拓扑排序）
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
            indegree[pre[0]] ++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }
        int count = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            count ++;
            for (Integer neighbor : graph.get(cur)) {
                indegree[neighbor] --;
                if (indegree[neighbor] == 0) queue.offer(neighbor);
            }
        }
        return count == numCourses;
    }


    public static void main(String[] args) {
        lc207 lc207 = new lc207();
        System.out.println(lc207.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }
}
