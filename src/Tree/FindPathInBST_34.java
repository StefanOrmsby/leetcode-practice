package Tree;

import java.util.ArrayList;

public class FindPathInBST_34 {
	private class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		if (root == null || target <= 0) {
			return list;
		}
	}
}
