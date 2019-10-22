package LinkedList;

public class DeleteNode_18_1 {
	private class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static void main(String[] args) {

	}

	public void DeleteNode(ListNode root, ListNode toBeDel) {
		if (root == null || toBeDel == null) {
			return;
		}
		/**
		 * 需要分不同种情况
		 */
		// 如果不是尾节点
		if (toBeDel.next != null) {
			ListNode p = toBeDel.next;
			int v = p.val;
			toBeDel.val = v;
			toBeDel.next = toBeDel.next.next;
		}
		// 如果既是尾节点又是头结点
		else if (root == toBeDel) {
			root = null;
		}
		// 如果仅仅是尾节点
		else {
			while (root.next != toBeDel) {
				root = root.next;
			}
			root.next = null;
		}

	}

	public void DeleteNode_practice2(ListNode root, ListNode toBeDel) {
		if (root == null || toBeDel == null)
			return;
		if (toBeDel.next != null) {
			toBeDel.val = toBeDel.next.val;
			toBeDel.next = toBeDel.next.next;
		} else if (root == toBeDel) {
			root = null;
		} else {
			while (root.next != toBeDel) {
				root = root.next;
			}
			root.next = null;
		}
	}

}
