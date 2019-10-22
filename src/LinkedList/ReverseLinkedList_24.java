package LinkedList;

import org.w3c.dom.ls.LSInput;

public class ReverseLinkedList_24 {
	private class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode reverseList(ListNode root) {
		if (root == null || root.next == null) {
			return root;
		}
		ListNode pre = null;
		ListNode cur = root;
		ListNode next = root.next;
		while (next != null) {
			cur.next = pre;
			pre = cur;
			cur = next;
			next = next.next;
		}
		return cur;

	}

	public ListNode reverseList_practice(ListNode root) {
		if (root == null || root.next == null) {
			return root;
		}
		ListNode pre = null;
		ListNode cur = root;
		ListNode next = root;
		while (cur != null) {
			next = next.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ListNode resverseList(ListNode root) {
		if (root == null) {
			return root;
		}
		ListNode pre = null;
		ListNode cur = root;
		ListNode next = root;
		while (cur != null) {
			next = next.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
