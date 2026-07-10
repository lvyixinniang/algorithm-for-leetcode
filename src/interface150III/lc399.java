package interface150III;

import java.util.*;

/**
 * @author hc
 * @date
 **/
public class lc399 {
//  todo 带权图路径查询 图 + DFS 或 并查集
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // 有些像邻接矩阵， 就是a/b 就有b/a，遍历存在的所有问题，会不会超时
        // 构建图
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            double val = values[i];
            graph.computeIfAbsent(a, k -> new HashMap<>()).put(b, val);
            graph.computeIfAbsent(b, k -> new HashMap<>()).put(a, 1.0 / val);
        }

        double[] ans = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String c = queries.get(i).get(0);
            String d = queries.get(i).get(1);
            if (!graph.containsKey(c) || !graph.containsKey(d)) {
                ans[i] = -1.0;
            } else {
                ans[i] = dfs(graph, c, d, new HashSet<>(), 1.0);
            }
        }

        return ans;
    }

    private double dfs(Map<String, Map<String, Double>> graph
            , String cur, String target, Set<String> visited, double product) {
        if (cur.equals(target)) return product;
        visited.add(cur);
        Map<String, Double> neighbors = graph.get(cur);
        if (neighbors != null) {
            for (Map.Entry<String, Double> entry : neighbors.entrySet()) {
                   String next = entry.getKey();
                   if (!visited.contains(next)) {
                       double result = dfs(graph, next, target, visited, product);
                       if (result != -1.0) return result;
                   }
            }
        }
        return -1.0;
    }
}
