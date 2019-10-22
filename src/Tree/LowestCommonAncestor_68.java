package Tree;

public class LowestCommonAncestor_68 {

	private static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// 发现目标节点则通过返回值标记该子树发现了某个目标结点
		if (root == null || root == p || root == q)
			return root;
		// 查看左子树中是否有目标结点，没有为null
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		// 查看右子树是否有目标节点，没有为null
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		// 都不为空，说明做右子树都有目标结点，则公共祖先就是本身
		if (left != null && right != null)
			return root;
		// 如果发现了目标节点，则继续向上标记为该目标节点
		return left == null ? right : left;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		root.left = node2;
		root.right = node3;
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		node2.left = node4;
		node2.right = node5;
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		node3.left = node6;
		node3.right = node7;

		LowestCommonAncestor_68 commonAncestor = new LowestCommonAncestor_68();
		TreeNode node = commonAncestor.lowestCommonAncestor(root, node4, node5);
		System.out.println(node.val);

	}
}
