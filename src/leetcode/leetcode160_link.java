package leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class leetcode160_link {
//    笨蛋本身,想到的方法: O(m*n)的时间复杂度, O(1)d的空间复杂度
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        while(headB != null){
//            ListNode headC = headA;
//            while(headC != null) {
//                if (headC == headB) {
//                    return headB;
//                } else {
//                    headC = headC.next;
//                }
//            }
//            headB = headB.next;
//        }
//        return null;
//    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB ==null){
            return null;
        }
        ListNode pA = headA , pB = headB;
        while(pA !=pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headB : pB.next;
        }
//        包含了0 pA 为 null 和pA== pB的情况
        return pA;
    }


}
