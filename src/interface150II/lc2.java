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
        ListNode new_head = new ListNode(0);
        ListNode cur = new_head;
        while (l1 != null || l2 != null) {
            int x = 0, y = 0;
            if (l1 != null) {
                x = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                y = l2.val;
                l2 = l2.next;
            }
            int sum = (x + y + jinwei) % 10;
            jinwei = (x + y + jinwei) / 10;
            cur.next = new ListNode(sum);
            cur = cur.next;
        }

        if (jinwei != 0) {
            cur.next = new ListNode(jinwei);
        }

        return new_head.next;
    }
}
