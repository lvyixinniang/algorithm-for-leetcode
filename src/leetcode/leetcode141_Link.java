package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetcode141_Link{

//    Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            if (!set.add(head))
                return true;
            head = head.next;
        }
        return false;


//        下面的代码,有部分情况没考虑到 , 不清楚是哪方面的情况
       /* if (head == null || head.next == null)
            return false;
        Map<Integer,ListNode> map = new HashMap<>();
        ListNode pA =  head;
        map.put(null,null);

        while (pA!=null){
            map.put(pA.val,pA);
            if(map.containsValue(pA))
                return true;
            pA = pA.next;
        }

        return false;*/
    }
}
