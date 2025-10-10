package interface150II;

import java.util.*;

public class lc207 {
//todo 采用BFS能通过47/54， 但还是需要改成拓扑排序的形式
//    拓扑排序是在BFS的基础上的 一种 思想
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 1 。构建邻接表 & 入度表
        List<Integer>[] graph = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>(); // 初始化
        }
        for (int[] p : prerequisites) {
            int ai = p[0], bi = p[1];
//            bi -> ai
            graph[bi].add(ai);
            indegree[ai]++;
        }

        // 2.  初始化队列：所有入读为 0 的课程
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.offer(i);
        }

        // 3.  BFS 拓扑排序
        int count = 0;
        while (!q.isEmpty()) {
            int cur = q.poll();
            count ++;
            for (int neighbor : graph[cur]) {
                indegree[neighbor]--;   // 删除 cur->neighbor
                if (indegree[neighbor] == 0) { // 若入读归零，则入队
                    q.offer(neighbor);
                }
            }
        }
        return count == numCourses;
    }
}
