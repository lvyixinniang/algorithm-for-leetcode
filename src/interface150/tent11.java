package interface150;

public class tent11 {
  public static class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
      this.val = val;
    }
  }
    public ListNode reverseBetween (ListNode head, int m, int n) {
        if (head == null || m == n) return head;
        // 翻转链表
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
//        记录到 两个开头的 节点
        for (int i = 1; i < m ; i++) {
            temp = temp.next;
        }
        ListNode preM = temp;// 反转区间的前驱节点
        ListNode nodeM = temp.next;// 反转区间的第一个节点
//        翻转
        ListNode curr = nodeM;
        ListNode prev = null;
        for (int i = m; i <= n; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
//        拼接
        preM.next = prev;
        nodeM.next = curr;

        return head;
    }

    public static void main(String[] args) {
        tent11 t11 = new tent11();
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        ListNode head4 = new ListNode(5);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        System.out.println(t11.reverseBetween(head, 2, 4));
    }
}
