package LinkedList;

public class FindKthToTailInLinkedList_22 {
	private class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode findKthToTailInLinkedList(ListNode root, int k) {
		if (root == null) {
			return root;
		}
		ListNode pre = root;
		ListNode cur = root;
		while (k-1 > 0) {
			if (cur != null) {
				cur = cur.next;
				k--;
			} else {
				return root;
			}
		}
		while (cur != null) {
			pre = pre.next;
			cur = cur.next;
		}
		return pre;
	}

	public static void main(String[] args) {
		int k = 3;
		while (k-1 > 0) {
			k--;
			System.out.println(k);
		}
	}
}
