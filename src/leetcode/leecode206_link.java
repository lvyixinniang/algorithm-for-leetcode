package leetcode;




public class leecode206_link {
    static class ListNode {
        int val;
        leecode206_link.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, leecode206_link.ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
//        初始化 , 方法一:

        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));
//        初始化 , 方法二

//        ListNode node5 = new ListNode(5);
//        ListNode node4 = new ListNode(4,node5);
//        ListNode node3 = new ListNode(3,node4);
//        ListNode node2 = new ListNode(2,node3);
//        ListNode head = new ListNode(1,node2);
//        初始化 , 方法三

//        ListNode head = new ListNode(1);
//        for (int i = 2;i<6;i++){
//            head = new ListNode(i,head);
//        }// val 1->2->3->4->5 ,但传递参数时会有错误,因为杠初始化完成 , 所以head头指针指向的是链表的末尾
        System.out.println(reverseList(head));

    }
   /* public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode reverse = new ListNode();
        ListNode point = head;
        int count =0;
        while(point.next !=null) {
            point = point.next;
            count++;
        }
        point.next = head;
//        错误 , val 5->1->2->3->4
        while(count>=0){
            reverse = point;
            reverse = reverse.next;
            point = point.next;
            count--;
        }
        reverse.next = null;
        return reverse;
    }*/

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode prev  =null;
        ListNode curr = head;
        while( curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
