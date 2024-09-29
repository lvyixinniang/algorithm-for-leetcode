package leetcode.Link;

import java.util.HashSet;
import java.util.Set;

public class leetcode142 {
      class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
//        快慢指针 只能求出 是否有环，但求不出交点在什么位置
        Set<ListNode> set = new HashSet<>();
        while (head != null){
            if (set.contains(head)) {
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
}
