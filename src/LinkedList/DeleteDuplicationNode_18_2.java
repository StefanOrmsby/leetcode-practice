package LinkedList;

public class DeleteDuplicationNode_18_2 {
	private class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode deleteDuplicationNode(ListNode root) {
		if (root == null) {
			return root;
		}
		ListNode pre = null;
		ListNode cur = root;
		while (cur != null && cur.next != null) {
			if (cur.val == cur.next.val) {
				int val = cur.val;
				// 注意这里的循环条件，不要忘了&&左边的，因为如果链表后半部分全部都是相等的，那么指针移到最后，再进循环判断条件的时候会发生 null.val
				// 会报nullpointerexception
				while (cur != null && cur.val == val) {
					cur = cur.next;
				}
				if (pre == null) {
					root = cur;
				} else {
					pre.next = cur;
				}
			} else {
				pre = cur;
				cur = cur.next;
			}
		}
		return root;
	}

	public ListNode deleteDuplicationNode_practice(ListNode root) {
		if (root == null || root.next == null) {
			return root;
		}
		ListNode cur = root;
		ListNode pre = null;
		while (cur != null && cur.next != null) {
			int val = cur.val;
			if (cur.val == cur.next.val) {
				while (cur != null && cur.val == val) {
					cur = cur.next;
				}
				if (pre == null) {
					root = cur;
				} else {
					pre.next = cur;
				}
			} else {
				pre = cur;
				cur = cur.next;
			}
		}
		return root;
	}

}
