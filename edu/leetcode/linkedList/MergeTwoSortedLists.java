package edu.leetcode.linkedList;

public class MergeTwoSortedLists {
	/**
	 * Easy
	 * compare each node,then add them to a new ListNode
	 * @param l1
	 * @param l2
	 * @return
	 */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null){
            return null;
        }
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode head=new ListNode(0);
        ListNode temp=head;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                head.next=l2;
                head=head.next;
                l2=l2.next;
            }else if(l1.val<=l2.val){
                head.next=l1;
                head=head.next;
                l1=l1.next;
            }
        }
        if(l1==null){
            head.next=l2;
        }
        if(l2==null){
            head.next=l1;
        }
        return temp.next;
    }


}
