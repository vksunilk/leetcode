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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        	var slow = head;
	var fast = head;

	// If there's a cycle, let the pointers enter it and meet
	while (fast != null && fast.next != null) {
		slow = slow.next;
		fast = fast.next.next;
		if (slow == fast)
			break;
	}

	// check if there's no cycle
	if (fast == null || fast.next == null)
		return null;

	// find the entry point of the cycle
	slow = head;
	while (slow != fast) {
		slow = slow.next;
		fast = fast.next;
	}
	return slow;
    }
}