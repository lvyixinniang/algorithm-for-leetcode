package leetcode.Link;

public class leetcode2_Link {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,
                new ListNode(4,
                        new ListNode(3)));
        ListNode l2 = new ListNode(5,
                new ListNode(6,
                        new ListNode(4)));
        System.out.println(addTwoNumbers(l1, l2));
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode head = null , tail = null;
       int carry = 0;
       while (l1 != null && l2 != null){
           int n1 = l1 != null ? l1.val : 0;
           int n2 = l2 != null ? l2.val : 0;
           int  sum = n1 +n2 +carry;
           if (head == null){
//               第一次求和的值 , 复制给 head 这个链表
               head = tail = new ListNode(sum%10);
           } else  {
               tail.next  =new ListNode(sum % 10);
               tail = tail.next;
           }
           carry =sum /10;
           if (l1 != null){
               l1 = l1.next;
           }
           if (l2 != null){
               l2 = l2.next;
           }
       }
       if ( carry > 0){
           tail.next = new ListNode(carry);
       }
       return head;
    }
}
