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
		// ����Ŀ��ڵ���ͨ������ֵ��Ǹ�����������ĳ��Ŀ����
		if (root == null || root == p || root == q)
			return root;
		// �鿴���������Ƿ���Ŀ���㣬û��Ϊnull
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		// �鿴�������Ƿ���Ŀ��ڵ㣬û��Ϊnull
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		// ����Ϊ�գ�˵��������������Ŀ���㣬�򹫹����Ⱦ��Ǳ���
		if (left != null && right != null)
			return root;
		// ���������Ŀ��ڵ㣬��������ϱ��Ϊ��Ŀ��ڵ�
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
