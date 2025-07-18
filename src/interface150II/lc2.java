package interface150II;

public class lc2 {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int jinwei = 0;
        ListNode ans = new ListNode(-1);
        ListNode head = new ListNode(0, ans);
        while (l1 != null || l2 != null) {
            int x1 = l1 == null ? 0 : l1.val;
            int x2 = l2 == null ? 0 : l2.val;
            int sum = x1 + x2 + jinwei;
            jinwei = sum / 10;
            ans.next = new ListNode(sum % 10);
            ans = ans.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (jinwei == 1) {
            ans.next = new ListNode(1);
        }
        return head.next.next;
    }
}
