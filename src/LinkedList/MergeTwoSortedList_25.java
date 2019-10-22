package LinkedList;

public class MergeTwoSortedList_25 {
	private class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode mergeTwoSortedList(ListNode pHead1, ListNode pHead2) {
		if (pHead1 == null) {
			return pHead2;
		}
		if (pHead2 == null) {
			return pHead1;
		}
		ListNode pHead = null;
		ListNode cur = null;
		while (pHead1 != null && pHead2 != null) {
			if (pHead1.val > pHead2.val) {
				if (pHead == null) {
					pHead = pHead2;
					cur = pHead;
				} else {
					cur.next = pHead2;
					cur = cur.next;
				}
				pHead2 = pHead2.next;
			} else {
				if (pHead == null) {
					pHead = pHead1;
					cur = pHead;
				} else {
					cur.next = pHead1;
					cur = cur.next;
				}
				pHead1 = pHead1.next;
			}
		}
		if (pHead1 != null) {
			cur.next = pHead1;
		}
		if (pHead2 != null) {
			cur.next = pHead2;
		}

		return pHead;
	}

	public ListNode mergeTwoSortedList_practice(ListNode pHead1, ListNode pHead2) {
		if (pHead1 == null) {
			return pHead2;
		}
		if (pHead2 == null) {
			return pHead1;
		}
		ListNode pHead = null;
		ListNode cur = null;
		while (pHead1 != null && pHead2 != null) {
			if (pHead1.val > pHead2.val) {
				if (pHead == null) {
					pHead = pHead2;
					cur = pHead2;
				} else {
					cur.next = pHead2;
					cur = cur.next;
				}
				pHead2 = pHead2.next;
			} else {
				if (pHead == null) {
					pHead = pHead1;
					cur = pHead1;
				} else {
					cur.next = pHead1;
					cur = cur.next;
				}
				pHead1 = pHead1.next;
			}
		}
		if (pHead1 != null) {
			cur.next = pHead1;
		}
		if (pHead2 != null) {
			cur.next = pHead2;
		}
		return pHead;
	}

	
	
	
	public ListNode mergeSortedList(ListNode pHead1, ListNode pHead2) {
		if (pHead1 == null) {
			return pHead2;
		}
		if (pHead2 == null) {
			return pHead1;
		}
		ListNode pHead = null;
		ListNode cur = null;
		while (pHead1 != null && pHead2 != null) {
			if (pHead1.val < pHead2.val) {
				if (pHead == null) {
					pHead = pHead1;
					cur = pHead1;
				} else {
					cur.next = pHead1;
					cur = cur.next;
				}
				pHead1 = pHead1.next;
			} else {
				if (pHead == null) {
					pHead = pHead2;
					cur = pHead2;
				} else {
					cur.next = pHead2;
					cur = cur.next;
				}
				pHead2 = pHead2.next;
			}
		}
		if (pHead1 != null) {
			cur.next = pHead1;
		}
		if (pHead2 != null) {
			cur.next = pHead2;
		}
		return pHead;
	}

}
