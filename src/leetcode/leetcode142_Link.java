package leetcode;

import java.util.HashSet;
import java.util.Set;

public class leetcode142_Link {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */

    public ListNode detectCycle(ListNode head) {
        if (head == null){
            return null;
        }

        ListNode pos = head;
        Set<ListNode> set =new HashSet<ListNode>();
        set.add(pos);
        pos = pos.next;

        while (pos != null &&!set.contains(pos)) {
            if (!set.add(pos)){
                return pos;
            }
            pos = pos.next;
        }

        return null;
    }
}
