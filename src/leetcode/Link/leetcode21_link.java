package leetcode.Link;



public class leetcode21_link {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));
        ListNode list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));
        System.out.println(mergeTwoLists(list1, list2));
    }
    public static class ListNode {
        int val;
        leetcode21_link.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, leetcode21_link.ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null||list2 ==null){
            return list2!=null?list2:list1;
        }

        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
            
        }
        prev.next = list1 ==  null ? list2:list1;
        return prehead.next;
    }
}
