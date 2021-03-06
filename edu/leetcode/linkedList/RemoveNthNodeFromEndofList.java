package edu.leetcode.linkedList;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class RemoveNthNodeFromEndofList {
	/**
	 * Easy
	 * define two cursers PRE AFT
	 * distance always be n
	 * move PRE and AFT,when PRE is null
	 * AFT will be the Nth from end of list
	 * 1.Find N+1th from the end of list
	 * 2.Remove Nth from the end of list
	 * @param head
	 * @param n
	 * @return
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head.next == null || head == null) {
			return null;
		}
		ListNode pre = head;
		ListNode aft = head;
		for (int i = 0; i < n; i++) {
			pre = pre.next;
			if (pre == null) {
				return head.next;
			}
		}
		pre = pre.next;
		while (pre != null) {
			aft = aft.next;
			pre = pre.next;
		}
		aft.next = aft.next.next;
		return head;
	}
	
	/**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd2(ListNode head, int n) {
        if (0 == n){
            return head;
        }
        int length = 1;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while (head.next != null){
            head = head.next;
            length++;
        }
        if(length == 1){
            return null;
        }
        length = length - n + 1;
        head = dummy;
        ListNode temp = null;
        for (int i = 1; i < length; i++){
            head = head.next;
        }
        temp = head.next.next;
        head.next = temp;
        return dummy.next;
    }
}
