package edu.leetcode.linkedList;

import java.util.LinkedList;
import java.util.List;

public class GetIntersectionNode {

    /**
     * @param headA: the first list
     * @param headB: the second list
     * @return: a ListNode 
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> list=new LinkedList<ListNode>();
        
        while(headA!=null){
            list.add(headA);
            headA=headA.next;
        }
        
        while(headB!=null){
            if(list.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}
