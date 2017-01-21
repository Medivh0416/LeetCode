package edu.leetcode.linkedList;

public class ReverseLinkedList {
	/**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        if(null==head){
            return null;
        }
        if(null==head.next){
            return head;
        }
        ListNode mid=head.next;    //mid node
        ListNode begin=head;        
        begin.next=null;
        ListNode end=null;
        while(null!=mid){
            end=mid.next;
            mid.next=begin;
            begin=mid;
            mid=end;
        }
        return begin;
    }
}
