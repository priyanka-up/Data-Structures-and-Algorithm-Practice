package ikTree;

public class BinaryTreeRightSideView199 {

	/*
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
 
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
		if(root == null)
		{
			return res;
		}
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
	    while(!queue.isEmpty())
        {
            int numnodes = queue.size();
            //List<Integer> temp = new ArrayList<>();
            int temp =0;
            for (int i = 0; i < numnodes; i++)
            {
                TreeNode node = queue.remove();
	    		temp = node.val;

	    	    if(node.left != null)
    	        {
    		        queue.add(node.left);
    		    }
    	        if(node.right != null)
    	        {
    		        queue.add(node.right);
    	        }
            }	
            res.add(temp);
    }
        
        return res;        
    }
}
	 */
}
