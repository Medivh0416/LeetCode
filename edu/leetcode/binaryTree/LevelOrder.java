package edu.leetcode.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

	public static void main(String[] args) {
		
		
	}
	
	private void levelOrder(TreeNode root){
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()){
			TreeNode node=queue.poll();
			if(node==null){
				continue;
			}
			if(node.left!=null){
				System.out.println(node.left);
				queue.offer(node.left);
			}
			if(node.right!=null){
				System.out.println(node.right);
				queue.offer(node.right);
			}
		}
	}
}
