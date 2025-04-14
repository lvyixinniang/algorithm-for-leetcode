package interface150;

import java.util.ArrayList;
import java.util.List;

public class zijie3 {
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public void reorderList(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            nodes.add(cur);
            cur = cur.next;
        }
        ListNode res1 = new ListNode(-1);
        ListNode res = res1;
        for (int i = 0; i < nodes.size() / 2; i++) {
            res1.next = nodes.get(0);
            nodes.remove(0);
            res1 = res1.next;
            res1.next = nodes.get(nodes.size() - 1);
            nodes.remove(nodes.size() - 1);
        }
        res1.next = null;

    }
}
