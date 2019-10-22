package Chap2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrintListFromTail_6 {
	private class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<>();
		if (listNode == null) {
			return list;
		}
		LinkedList<ListNode> stack = new LinkedList<>();
		while (listNode != null) {
			stack.push(listNode);
			listNode = listNode.next;
		}
		while (!stack.isEmpty()) {
			list.add(stack.pop().val);
		}
		return list;
	}
}
