package leetcode.Link;

public class leetcode148_LInk {
     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

//        分
        ListNode fast = head.next, slow = head;
//        求中位数
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
//        递归分割
//        返回2的是已经排序后的链表
//        治
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);

//        合
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left != null && right != null){
            if (left.val < right.val){
                h.next = left;
                left = left.next;
            } else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left !=null ? left : right;

        return res.next;
    }
}
