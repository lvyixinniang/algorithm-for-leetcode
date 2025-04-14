package interface150;

public class Java12 {
  public static class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
      this.val = val;
    }
  }
    public boolean isPail (ListNode head) {
        // write code here
        if (head == null) return false;
        if (head.next == null) return true;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 翻转后续链表
        ListNode curr = slow.next, next = null, prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 比较判断
        ListNode first = head, second = prev;
        while (second != null) {
            if (second.val != first.val) {
                return false;
            }
            second = second.next;
            first = first.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(1);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = null;
        Java12 java12 = new Java12();
        System.out.println(java12.isPail(head));
    }
}
