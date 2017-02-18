package edu.leetcode.binaryTree;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	
	/**
	 * Medium 
	 * Use Recursion
	 * the preorder's first element always the Root of the tree
	 * so find the root in inorder,the leftside will be LeftTrees,Rightside will be RightTrees
	 * Then recurse
	 * @param preorder
	 * @param inorder
	 * @return
	 */
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return recursion(0, 0, inorder.length - 1, preorder, inorder);
	}

	public TreeNode recursion(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
		if (preStart > preorder.length - 1 || inStart > inEnd) {
			return null;
		}
		int inIndex = 0;
		TreeNode root = new TreeNode(preorder[preStart]);
		for (int i = inStart; i <= inEnd; i++) {
			if (preorder[preStart] == inorder[i]) {
				inIndex = i;
			}
		}
		root.left = recursion(preStart + 1, inStart, inIndex - 1, preorder, inorder);
		root.right = recursion(preStart + inIndex + 1 - inStart, inIndex + 1, inEnd, preorder, inorder);
		return root;
	}
}
