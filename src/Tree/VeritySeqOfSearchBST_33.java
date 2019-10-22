package Tree;

public class VeritySeqOfSearchBST_33 {
	private class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	public boolean judge(int[] sequence) {
		if (sequence == null || sequence.length <= 0)
			return false;
		return isSearchBTS(sequence, 0, sequence.length - 1);
	}

	private boolean isSearchBTS(int[] sequence, int begin, int end) {
		if (begin >= end)
			return true;
		int root = sequence[end];
		int i = begin;
		while (i <= end && sequence[i] < root) {
			i++;
		}
		int boundary = i;
		while (i < end) {
			if (sequence[i] < root)
				return false;
			i++;
		}
		return isSearchBTS(sequence, begin, boundary - 1) && isSearchBTS(sequence, boundary, end - 1);
	}

	public static void main(String[] args) {
		VeritySeqOfSearchBST_33 vs = new VeritySeqOfSearchBST_33();
		int[] sequence = { 4, 8, 6, 12, 16, 14, 10 };
		System.out.println(vs.judge(sequence));
	}

	public boolean judge_prc(int[] arr) {
		if (arr == null || arr.length <= 0)
			return false;
		return isSearchBST_prc(arr, 0, arr.length - 1);
	}

	private boolean isSearchBST_prc(int[] arr, int i, int j) {
		if (i >= j)
			return true;

		int root = arr[j];
		while (arr[i] < root && i <= j) {
			i++;
		}
		int boundary = i;
		while (i < j) {
			if (arr[i] < root) {
				return false;

			}
			i++;

		}
		return isSearchBST_prc(arr, i, boundary - 1) && isSearchBST_prc(arr, boundary, j - 1);

	}

}
