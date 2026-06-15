package interface150II;

public class lc92 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right || head.next == null) return head;
        ListNode dummy = new ListNode(-1, head);
        ListNode cur = dummy;

        ListNode oldhead = null, newtail = null;
        int count = 0;
        while (cur != null) {

            if (count == left - 1) {
                oldhead = cur;
            }
            if (count == right) {
                newtail = cur;
                break;
            }
            cur = cur.next;
            count ++;
        }
        // 设置 前置条件
        ListNode newhead = oldhead.next;
        oldhead.next = null;
        ListNode oldtail = newtail.next;
        newtail.next = null;

        // 翻转链表
        reverse(newhead);

        // 重新合成链表
        oldhead.next = newtail;
        newhead.next = oldtail;

        return dummy.next;
    }

    private void reverse(ListNode head) {
      if (head == null || head.next == null) return;

      ListNode pre = null, cur = head;
      while (cur != null) {
          ListNode next = cur.next;
          cur.next = pre;
          pre = cur;
          cur = next;
      }
    }


    public static void main(String[] args) {
        lc92 solution = new lc92();
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
//        ListNode head = new ListNode(1);
        ListNode head = new ListNode(3, new ListNode(5));
        System.out.println(solution.reverseBetween(head, 1, 1));
    }
}
