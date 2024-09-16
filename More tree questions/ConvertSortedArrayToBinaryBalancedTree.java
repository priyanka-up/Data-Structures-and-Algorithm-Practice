package ikTree;

public class ConvertSortedArrayToBinaryBalancedTree {
	
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

	    public TreeNode sortedArrayToBST(int[] nums) {
	        int start =0;
	        int end = nums.length -1;
	        return helper(nums,start,end);
	        
	    }
	    public TreeNode helper(int[] arr, int start, int end)
	    {
	        //base case
	        if(start> end)//problem size 0
	        {
	            return null;
	        }
	        if(start == end) //problem size 1
	        {
	            return new TreeNode(arr[start]);
	        }
	        //recursive case
	        int mid =0;
	        mid = start + (end-start)/2;
	        TreeNode rootnode = new TreeNode(arr[mid]);
	        rootnode.left = helper(arr,start,mid-1);
	        rootnode.right = helper(arr,mid+1,end);
	        return rootnode;
	    }
	}


