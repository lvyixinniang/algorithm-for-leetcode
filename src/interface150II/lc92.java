package interface150II;

public class lc92 {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
//todo 之前的写法有错误 2025/7/21(重做
    public ListNode reverseBetween(ListNode head, int left, int right) {
      if (head.next == null || left == right) return head;
        // 需要四个节点 left_index, right_index , left前驱节点， right后置节点
        ListNode dummy = new ListNode(-501);
        dummy.next = head;
        ListNode curr = dummy;
        // left前置节点，             right后置节点     left节点           right节点
        ListNode groupStart = null, groupEnd = null, leftIndex = null, rightIndex = null;

        // 定位左区间前驱节点（groupStart）[7](@ref)
        for (int i = 0; i < left - 1; i++) {
            curr = curr.next;
        }
         groupStart = curr;        // left 前驱节点
         leftIndex = groupStart.next; // 左节点

        // 定位右节点（rightIndex）[6](@ref)
        curr = groupStart;
        for (int i = 0; i <= right - left; i++) {
            curr = curr.next;
        }
         rightIndex = curr;      // 右节点
         groupEnd = rightIndex.next; // 右节点后继

        // 先断开 连接
        groupStart.next = null;
        rightIndex.next = null;

        // 反转
        ListNode prev = null;
        ListNode next = null;
        curr = leftIndex;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 连接节点
        groupStart.next = prev;
        leftIndex.next = groupEnd;
        return dummy.next;
    }

    public static void main(String[] args) {
        lc92 solution = new lc92();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
//        ListNode head = new ListNode(1);
        System.out.println(solution.reverseBetween(head, 2, 4));
    }
}
