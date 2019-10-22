package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FromTail2Head_6 {
	// 节点类的定义
	private class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public List<Integer> printFromTailToHead(ListNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		LinkedList<ListNode> stack = new LinkedList<>();
		while (root != null) {
			stack.push(root);
			root = root.next;
		}
		while (!stack.isEmpty()) {
			list.add(stack.pop().val);
		}
		return list;
	}

}
