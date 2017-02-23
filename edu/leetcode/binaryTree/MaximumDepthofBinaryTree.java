package edu.leetcode.binaryTree;

public class MaximumDepthofBinaryTree {

	/**
	 * @param root:
	 * The root of binary tree.
	 * @return: An integer.
	 */
	private int deep = 0;
	public int maxDepth(TreeNode root) {
		if (null == root) {
			return 0;
		}
		recursion(root, 1);
		return deep;
	}

	private void recursion(TreeNode root, int sum) {
		if (null == root) {
			return;
		}
		if (sum > deep) {
			deep = sum;
		}
		recursion(root.left, sum + 1);
		recursion(root.right, sum + 1);
	}
}
