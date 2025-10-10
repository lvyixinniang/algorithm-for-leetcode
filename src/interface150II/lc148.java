package interface150II;

public class lc148 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
// todo 不会归并排序 8/28日重做 (不会）
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

//        先从中间分开
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        
        // 递归调用该方法
        ListNode left = sortList(head);
        ListNode right = sortList(temp);
        
        // 在合并
        return mergeList(left, right); // 我感觉我额度返回值是错误的
    }

    private ListNode mergeList(ListNode head, ListNode temp) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while (head != null && temp != null) {
            if (head.val >= temp.val) {
                cur.next = temp;
                temp = temp.next;
            } else {
                cur.next = head;
                head = head.next;
            }
            cur = cur.next;
        }
        cur.next = head == null ? temp : head;
        return dummy.next;
    }


}
