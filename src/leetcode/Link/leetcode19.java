package leetcode.Link;

public class leetcode19 {
    public static  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }

//        先求出链表 总长度
        ListNode head1 = head;
        int len = 0;
        while (head1 != null) {
            len ++;
            head1 = head1.next;
        }

        ListNode pre = head;
        if (len == n) return head.next;
//        int sum = len;
        while (len - 1 != n && pre != null) {
            pre = pre.next;
            len --;
        }
        pre.next = pre.next.next ;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2));
        removeNthFromEnd(head,2);
    }
}
