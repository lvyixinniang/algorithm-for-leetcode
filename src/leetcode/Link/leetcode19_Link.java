package leetcode.Link;

public class leetcode19_Link {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
//        ListNode head =new ListNode(1,
//                new ListNode(2));
//        ListNode head = new ListNode(1);
        int n =2;
        System.out.println(removeNthFromEnd(head, n));
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy  =new ListNode(0,head);
        int length = getLength(head);
        ListNode cur = dummy;
        for (int i = 1; i < length - n +1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
    public static int getLength(ListNode head){
        int length =0 ;
        while(head != null){
            ++length;
            head = head.next;
        }
        return length;
    }
}
