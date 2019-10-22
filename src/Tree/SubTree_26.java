package Tree;

public class SubTree_26 {

	private class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	public boolean hasSubTree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val) {
				return doesTree1HashTree2(root1, root2);
			}
			if (!result) {
				hasSubTree(root1.left, root2);
			}
			if (!result) {
				hasSubTree(root1.right, root2);
			}
		}
		return result;
	}

	private boolean doesTree1HashTree2(TreeNode root1, TreeNode root2) {
		if (root2 == null) {
			return true;
		}
		if (root1 == null) {
			return false;
		}
		if (root1.val != root2.val) {
			return false;
		}
		return doesTree1HashTree2(root1.left, root2.left) && doesTree1HashTree2(root1.right, root2.right);

	}

	public boolean hasSubTree_prc(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val) {
				result = doesTree1HaveTree2_prc(root1, root2);
			}
			if (!result) {
				hasSubTree_prc(root1.left, root2);
			}
			if (!result) {
				hasSubTree_prc(root1.right, root2);
			}
		}
		return result;
	}

	private boolean doesTree1HaveTree2_prc(TreeNode root1, TreeNode root2) {
		if (root2 == null)
			return true;
		if (root1 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		return doesTree1HaveTree2_prc(root1.left, root2.left) && doesTree1HaveTree2_prc(root1.right, root2.right);
	}

}
