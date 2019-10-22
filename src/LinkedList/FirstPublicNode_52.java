package LinkedList;

import java.util.LinkedList;

public class FirstPublicNode_52 {
	private class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode firstPublicNode(ListNode pHead1, ListNode pHead2) {
		LinkedList<ListNode> stack1 = new LinkedList<>();
		LinkedList<ListNode> stack2 = new LinkedList<>();
		while (pHead1 != null) {
			stack1.push(pHead1);
			pHead1 = pHead1.next;
		}
		while (pHead2 != null) {
			stack2.push(pHead2);
			pHead2 = pHead2.next;
		}
		ListNode publicNode = null;
		while (!stack1.isEmpty() && !stack2.isEmpty()) {
			if (stack1.peek() == stack2.pop()) {
				publicNode = stack1.pop();
			} else {
				return publicNode;
			}
		}
		return null;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ListNode firstPublicNode_practice(ListNode pHead1, ListNode pHead2) {
		if (pHead1 == null || pHead2 == null) {
			return null;
		}
		LinkedList<ListNode> stack1 = new LinkedList<>();
		LinkedList<ListNode> stack2 = new LinkedList<>();
		while (pHead1 != null) {
			stack1.push(pHead1);
			pHead1 = pHead1.next;
		}
		while (pHead2 != null) {
			stack2.push(pHead2);
			pHead2 = pHead2.next;
		}
		ListNode publicNode = null;
		while (stack1.peek() == stack2.pop()) {
			publicNode = stack1.pop();
		}
		return publicNode;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
