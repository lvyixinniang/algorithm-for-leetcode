package interface150II;

public class lc86 {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode partition(ListNode head, int x) {
        ListNode little = new ListNode(-101);
        ListNode more = new ListNode(-101);
        ListNode littleTemp = little;
        ListNode moreTemp = more;
        if (head == null || head.next == null || x < -100) return head;

        // 遍历
        ListNode cur = head;
        ListNode next = null;
        while (cur != null) {
            if (cur.val < x) {
                little.next = cur;
                next = cur.next;
                cur.next = null;
                little = little.next;
            } else {
                more.next = cur;
                next = cur.next;
                cur.next = null;
                more = more.next;
            }
            cur = next;
        }
        little.next = moreTemp.next;
        return littleTemp.next;
    }
}
