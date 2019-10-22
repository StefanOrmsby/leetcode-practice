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
		 * ��Ҫ�ֲ�ͬ�����
		 */
		// �������β�ڵ�
		if (toBeDel.next != null) {
			ListNode p = toBeDel.next;
			int v = p.val;
			toBeDel.val = v;
			toBeDel.next = toBeDel.next.next;
		}
		// �������β�ڵ�����ͷ���
		else if (root == toBeDel) {
			root = null;
		}
		// ���������β�ڵ�
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
