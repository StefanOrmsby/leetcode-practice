package Tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrintTreeEveryLayer_32_2 {
	private class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	public void printTreeEveryLayer(TreeNode root) {
		if (root == null) {
			return;
		}
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				System.out.println(node.val + " ");
				if (node.left != null)
					queue.offer(node.left);
				if (node.right != null) {
					queue.offer(node.right);
				}
			}
			System.out.println();
		}
	}
}
