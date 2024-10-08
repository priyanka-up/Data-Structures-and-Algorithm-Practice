package ikTree;
//top down dfs

public class PathSum112 {
	
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	
	    public boolean hasPathSum(TreeNode root, int targetSum) {
	        //base case
	        if(root == null)
	        {
	            return false;
	        }
	        if((root.left == null) && (root.right == null))
	        {
	            if(targetSum == root.val)
	            {
	                return true;
	            }
	        }
	        
	        //recursive case
	        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
	         
	    }
	    
	  
	    
	}


