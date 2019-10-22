package LinkedList;

import java.util.HashSet;

public class EntryNodeOfLoop_23 {
	private class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode entryNodeOfLoop(ListNode root) {
		HashSet<ListNode> set = new HashSet<>();
		while (root != null && set.add(root)) {
			root = root.next;
		}
		return root;
	}

}
