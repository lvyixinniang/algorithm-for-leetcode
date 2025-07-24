package interface150II;

public class lc25 {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
//  todo 这也没做出来 2025/7/20(重做
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head.next == null || k <= 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupEnd = dummy;
        ListNode curr = head;
        while (curr != null) {
            // 判断剩余节点是否够一个组
            ListNode check = curr;
            for (int i = 0; i < k; i++) {
                if (check == null) return dummy.next;
                check = check.next;
            }

            // 反转链表
            ListNode next = null;
            ListNode prev = null;
            ListNode groupStart = curr;
            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // 连接链表
            groupEnd.next = prev;
            groupStart.next = curr;
            groupEnd = groupStart;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        lc25 lc25 = new lc25();
        ListNode head = lc25.reverseKGroup(lc25.new ListNode(1, lc25.new ListNode(2, lc25.new ListNode(3, lc25.new ListNode(4)))), 3);
    }
}
