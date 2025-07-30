package interface150II;

import java.util.HashSet;
import java.util.Set;

public class lc82 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        // 检测重复字符 理解错题目了
        ListNode dummy = new ListNode(-301);
        dummy.next = head;
        ListNode curr = head;
        ListNode start = dummy; // 重复元素的开始节点

        if (curr == null) return head;

        while (curr != null && curr.next != null) {
//            判断是否是重复字符
            if(curr.val == curr.next.val) {
                int temp = curr.next.val;
                while (temp == curr.val) {
                    curr = curr.next;
                    if (curr == null) break;
                }
            }
            if (curr == null || (curr != null && (curr.next != null && curr.val != curr.next.val)) || (curr.next == null)) {
                start.next = curr;
                start = curr;
                if (curr != null && curr.next != null) curr = curr.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(1,
//                new ListNode(2,
//                        new ListNode(3,
//                                new ListNode(3,
//                                        new ListNode(4,
//                                                new ListNode(4,
//                                                        new ListNode(5)))))));
        ListNode head = new ListNode(1,new ListNode(1));
        lc82 lc = new lc82();
        System.out.println(lc.deleteDuplicates(head));
    }
}
