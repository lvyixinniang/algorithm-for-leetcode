package leetcode.Graph;

import java.util.*;

public class leetcode209 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
//  课程 待 解锁的 数量， 或者 说是 图 的高度
        int[] courses = new int[numCourses];
        Arrays.fill(courses,0);
//        记录对应解锁 课程
        Map<Integer, List<Integer>> needUnlock = new HashMap<>();
        for (int[] pair : prerequisites) {
//            （0 ， 1） 先 1 后 0
            int target = pair[0];
            int need = pair[1];
            final List<Integer> orDefault = needUnlock.getOrDefault(need , new ArrayList<>());
            orDefault.add(target);
            needUnlock.put(need,orDefault);
            courses[target]++;
        }
//        上课 用的队列
        Deque<Integer> deque = new LinkedList<>();
//        先 将 不需要解锁的课程 加入其中
        for (int i = 0; i < numCourses; i++) {
            if (courses[i] == 0) {
                deque.addLast(i);
            }
        }

        while (!deque.isEmpty()) {
            final Integer c = deque.pollFirst();
            if ( needUnlock.containsKey(c)) {
                final List<Integer> integers = needUnlock.get(c);
                for (Integer i : integers) {
                    if ( courses[i] > 0) {
                        courses[i] --;
                    }
                    if (courses[i] == 0) {
                        deque.addLast(i);
                    }
                }
            }
            needUnlock.remove(c);
        }
        for (int c : courses) {
            if ( c > 0){
                return false;
            }
        }
        return true;
    }
}
