package edu.leetcode.linkedList;

public class ReverseLinkedListII {
	/**
	 * 
	 * Mid:
	 * set a dummy incase m=1 null point exception
	 * 
     * @param ListNode head is the head of the linked list 
     * @oaram m and n
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m , int n) {
        // write your code
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode l1=dummy;
        ListNode l2=head;
        for(int i=1;i<m;i++){
            l1=l1.next;
        }
        for(int i=1;i<n;i++){
            l2=l2.next;
        }
        ListNode temp=l1.next;
        ListNode begin=l1.next;
        ListNode mid=begin.next;
        ListNode end=null;
        while(begin!=l2){
            end=mid.next;
            mid.next=begin;
            begin=mid;
            mid=end;
        }
        l1.next=begin;
        temp.next=end;
        return dummy.next;
    }
}
