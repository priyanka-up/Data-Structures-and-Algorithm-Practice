package ikTree;
//bottomup dfs

public class countUnivalSubtree {
	
	    private int globalCount = 0;
	    public int countUnivalSubtrees(TreeNode root) {
	        if(root == null)
	            return 0;
	        dfs(root);
	        return globalCount;       
	    }
	    public boolean dfs(TreeNode root)
	    {
	        //base case
	        if(root.left == null && root.right == null)
	        {
	            globalCount++;
	            return true;
	        }
	        //recursive case
	        boolean amIunival = true;
	        boolean bl = true;
	        boolean rl = true;
	        if(root.left != null)
	        {
	            bl = dfs(root.left);
	            if(bl == false || (root.val != root.left.val))
	                amIunival = false;
	        }
	        if(root.right != null)
	        {
	            rl = dfs(root.right);
	            if(rl == false || (root.val != root.right.val))
	                amIunival = false;
	        }
	        if(amIunival)
	            globalCount += 1;
	        return amIunival; 
	    }
	}


