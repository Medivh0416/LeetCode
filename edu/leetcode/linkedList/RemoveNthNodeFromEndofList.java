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
}
