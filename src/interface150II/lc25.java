package interface150II;

public class lc25 {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
//  todo 这也没做出来
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        ListNode groupEnd = dummy;

        while (curr != null) {
            // 先检查剩余节点 是否够翻转
            ListNode check = curr;
            for (int i = 0; i < k - 1; i++) {
                if (check == null) return dummy.next;
                check = check.next;
            }

            // 反转
            ListNode next = null;
            ListNode prev = null;
            ListNode groupHead = curr;
            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // 连接链表
            groupEnd.next = prev;
            groupHead.next = curr;
            groupEnd = groupHead;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        lc25 lc25 = new lc25();
        ListNode head = lc25.reverseKGroup(lc25.new ListNode(1, lc25.new ListNode(2, lc25.new ListNode(3, lc25.new ListNode(4)))), 3);
    }
}
