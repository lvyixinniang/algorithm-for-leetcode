package interface150II;

public class lc61 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
//  todo 边界值处理不当
    public ListNode rotateRight(ListNode head, int k) {
      if (head == null || head.next == null) return head;
        //1. 计算链表长度并找到为节点
        ListNode tail = null;
        ListNode cur = head;
        int size = 1;
        while (cur.next != null) {
            size++;
            cur = cur.next;
        }
        tail = cur; // 此时是尾节点

        // 形成循环链表
        tail.next = head;

        // 3.计算有旋转步数 （k 可能大于 size）
        k = k % size;
        if (k == 0) {
            tail.next = null;
            return head;
        }

        // 4. 找到新尾节点 （索引 size - k - 1) 和新头结点
        ListNode new_tail = head;
        for (int i = 0; i < size - k - 1; i++) {
            new_tail = new_tail.next;
        }
        ListNode new_head = new_tail.next;

        // 5.断开连接： 新尾节点。next 置null
        new_tail.next = null;

        return new_head;
    }

    public static void main(String[] args) {
        lc61 lc = new lc61();
//        ListNode head = new ListNode(1,
//                new ListNode(2,
//                        new ListNode(3,
//                                new ListNode(4,
//                                        new ListNode(5)))));
        ListNode head = new ListNode(1, new ListNode(2));
        lc.rotateRight(head, 1);
    }
}
