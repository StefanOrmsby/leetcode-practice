package practice;
/**
缁欏嚭涓や釜聽闈炵┖ 鐨勯摼琛ㄧ敤鏉ヨ〃绀轰袱涓潪璐熺殑鏁存暟銆傚叾涓紝瀹冧滑鍚勮嚜鐨勪綅鏁版槸鎸夌収聽閫嗗簭聽鐨勬柟寮忓瓨鍌ㄧ殑锛屽苟涓斿畠浠殑姣忎釜鑺傜偣鍙兘瀛樺偍聽涓�浣嵚犳暟瀛椼��
濡傛灉锛屾垜浠皢杩欎袱涓暟鐩稿姞璧锋潵锛屽垯浼氳繑鍥炰竴涓柊鐨勯摼琛ㄦ潵琛ㄧず瀹冧滑鐨勫拰銆�
鎮ㄥ彲浠ュ亣璁鹃櫎浜嗘暟瀛� 0 涔嬪锛岃繖涓や釜鏁伴兘涓嶄細浠� 0聽寮�澶淬��
绀轰緥锛�
杈撳叆锛�(2 -> 4 -> 3) + (5 -> 6 -> 4)
杈撳嚭锛�7 -> 0 -> 8
鍘熷洜锛�342 + 465 = 807
 */
public class AddTwoNumbers_002 {
	public class ListNode {  
		// init init
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode pre = new ListNode(0);
		ListNode cur = pre;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int v1 = l1 == null ? 0 : l1.val;
			int v2 = l2 == null ? 0 : l2.val;
			int sum = v1 + v2 + carry;
			carry = sum / 10;
			sum = sum % 10;
			cur.next = new ListNode(sum);
			cur = cur.next;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}
		if (carry == 1) {
			cur.next = new ListNode(1);
		}
		return pre.next;

	}

}
