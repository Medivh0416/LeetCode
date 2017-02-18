package edu.leetcode.binaryTree;

public class SubTree {

    /**
     * @param T1, T2: The roots of binary tree.
     * @return: True if T2 is a subtree of T1, or false.
     */
	public boolean isSubtree(TreeNode T1, TreeNode T2) {
        if(null==T2){
            return false;
        }
        if(null==T1){
            return true;
        }
        return subTreeRecursion(T1,T2)||isSubtree(T1.left,T2)||isSubtree(T1.left,T2);
    }
    
    private boolean subTreeRecursion(TreeNode T1,TreeNode T2){
        
        if(T1==null&&T2==null){
            return true;
        }
        if(T1==null||T2==null){
            return false;
        }
        if(T1.val!=T2.val){
            return false;
        }
        return subTreeRecursion(T1.left,T2.left)||subTreeRecursion(T1.right,T2.right);
    }
}
