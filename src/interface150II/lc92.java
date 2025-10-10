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
      // left 和 right 是索引
      if (head.next == null || left == right) return head;

      ListNode dummy = new ListNode(-1,head);
        ListNode prev = dummy; // left 前一个索引位置
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }


        ListNode leftIndex = prev.next;
        prev.next = null; // 断开 prev 到 leftIndex
        // 寻找 rightIndex
        ListNode rightIndex = leftIndex.next;
        for (int i = 0; i < (right - left) - 1; i++) {
            rightIndex = rightIndex.next;
        }


        ListNode next = rightIndex.next;
        rightIndex.next = null; // 断开 rightIndex 和 next

        // 翻转链表
        reverse(leftIndex, rightIndex);

        // 合并链表
        // 两边的链表 prev , next
        prev.next = rightIndex;
        leftIndex.next = next;
        return dummy.next;
    }

    private void reverse(ListNode leftIndex, ListNode rightIndex) {
        ListNode prev = null, curr = leftIndex, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
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
