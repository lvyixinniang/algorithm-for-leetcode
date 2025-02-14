package link_tree_stracking.xunhuan;

import java.util.ArrayList;
import java.util.List;

public class lc2058 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> res = new ArrayList<>();
        while (head != null) {
            res.add(head.val);
            head = head.next;
        }
        int[] resArr = new int[]{-1,-1};
        List<Integer> list = new ArrayList<>(); // 存储极值信息
        for (int i = 1; i < res.size() - 1; i++) {
            if (res.get(i) > res.get(i + 1) && res.get(i) > res.get(i - 1)) {
                list.add(i);
            } else if (res.get(i) < res.get(i + 1) && res.get(i) < res.get(i - 1)) {
                list.add(i);
            }
        }
        if (list.size() <= 1) return resArr;
        resArr[1] = list.get(list.size() - 1) - list.get(0);
        int minn = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) < minn) {
                minn = list.get(i + 1) - list.get(i);
            }
        }
        resArr[0] = minn;
        return resArr;
    }

    public static void main(String[] args) {
//        [5,3,1,2,5,1,2]
/*
        ListNode head = new ListNode(5, new ListNode(3, new ListNode(1, new ListNode(2
                , new ListNode(5, new ListNode(1, new ListNode(2)))))));
*/
//        [2,2,1,3]
        ListNode head = new ListNode(2, new ListNode(2, new ListNode(1, new ListNode(3))));
        System.out.println(nodesBetweenCriticalPoints(head));

    }
}
