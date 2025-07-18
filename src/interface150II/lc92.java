package interface150II;

public class lc92 {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
//todo 之前的写法有错误
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode pre = res;

        // 定位 left 的前驱节点
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode startNode = pre.next; //反转区间起点

        // 定位 right 节点
        ListNode endNode = startNode;
        for (int i = 0; i < right - left; i++) {
            endNode = endNode.next;
        }
        ListNode post = endNode.next; //反转区间后 第一个节点

        // 切断子链表， 反转区间 【startNode， endNode】
        pre.next = null;
        endNode.next = null;
        reverse(startNode);

        // 拼接链表
        pre.next = endNode;
        startNode.next = post;

        return res.next;
    }
    private void reverse(ListNode head) {
      ListNode prev = null;
      ListNode curr = head;
      while (curr != null) {
          ListNode next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
      }
    }
}
