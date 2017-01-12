package edu.leetcode.linkedList;

public class SwapNodesinPairs {
	/**
	 * Easy
	 * 1.Set newHead to store the LinkList
	 * 2.create 2 temp to swap
	 * @param head
	 * @return
	 */
	public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode newHead=head.next;
        head.next=newHead.next;
        newHead.next=head;
        while(head.next!=null&&head.next.next!=null){
            ListNode tempHead=null;
            ListNode tempTail=null;
            tempHead=head.next;
            tempTail=head.next.next;
            tempHead.next=tempTail.next;
            tempTail.next=tempHead;
            head.next=tempTail;
            head=tempHead;
        }
        return newHead;
    }
}
