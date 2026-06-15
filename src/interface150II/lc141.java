package interface150II;

public class lc141 {
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
