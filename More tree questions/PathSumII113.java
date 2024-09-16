package ikTree;
//top down dfs

public class PathSumII113 {
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
	
	    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

	        List<Integer> pathNodes = new ArrayList<>();
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        dfs(root,targetSum,pathNodes,result);
	        return result;
	    }
	    
	    private void dfs(TreeNode root, int targetSum,List<Integer> pathNodes,List<List<Integer>> result)
	    {
	       if(root == null)
	       {
	          return;
	        }
	        //leaf worker
	        if(root.left == null && root.right == null)
	        {
	            if(root.val == targetSum)
	            {
	                pathNodes.add(root.val);
	                result.add(new ArrayList<>(pathNodes));//copy of slate
	                pathNodes.remove(pathNodes.size() - 1);
	            }
	           // return result;
	        }
	        //internal worker
	        if(root.left != null)
	        {
	            pathNodes.add(root.val);
	            dfs(root.left,targetSum -root.val, pathNodes,result);
	            pathNodes.remove(pathNodes.size() - 1);
	        }
	        if(root.right != null)
	        {
	            pathNodes.add(root.val);
	            dfs(root.right,targetSum -root.val,pathNodes,result);
	            pathNodes.remove(pathNodes.size() - 1);
	        }
	       // return result;
	    }
	    
	}


