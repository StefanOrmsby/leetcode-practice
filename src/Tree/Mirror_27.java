package Tree;

public class Mirror_27 {
	private class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	public void mirror(TreeNode root) {
		exchangeChildren(root);
	}

	private void exchangeChildren(TreeNode root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			return;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		if (root.left != null) {
			exchangeChildren(root.left);
		}
		if (root.right != null) {
			exchangeChildren(root.right);
		}
	}

	public void exchange(TreeNode root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null)
			return;
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		exchange(root.left);
		exchange(root.right);
	}

}
