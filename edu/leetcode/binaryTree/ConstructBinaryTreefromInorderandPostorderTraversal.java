package edu.leetcode.binaryTree;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
	/**
	 * Medium:30min
	 * Similiar to preorder
     *@param inorder : A list of integers that inorder traversal of a tree
     *@param postorder : A list of integers that postorder traversal of a tree
     *@return : Root of a tree
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return recursion(postorder.length-1,0,inorder.length-1,inorder,postorder);
    }
    
    TreeNode recursion(int postStart,int inStart,int inEnd,int[] inorder, int[] postorder){
        if(postStart<0||inStart>inEnd){
            return null;
        }
        TreeNode root=new TreeNode(postorder[postStart]);
        int index=0;
        for(int i=inStart;i<=inEnd;i++){
            if(inorder[i]==root.val){
                index=i;
                break;
            }
        }
        
        root.right=recursion(postStart-1,index+1,inEnd,inorder,postorder);
        root.left=recursion(index-1+postStart-inEnd,inStart,index-1,inorder,postorder);
        
        return root;
        
        
    }
}
