package ikTree;
import java.util.*;

import javax.swing.tree.TreeNode;

public class ZigzagBfs {
	
	class Solution {
	    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        ArrayList<List<Integer>> res = new ArrayList<>();
	        if(root == null)
	        {
	            return res;
	        }
	        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.addFirst(root);
	        queue.addLast(null);
	        
	        LinkedList<Integer> temp = new LinkedList<Integer>();
	        boolean rtol = true;

	       while(!queue.isEmpty())
	        {
	        	TreeNode node = queue.remove();
	        	if(node != null)
	        	{
	               if(rtol)
	               {    
	                  temp.addLast(node.val);
	                }
	                else
	                {
	                    temp.addFirst(node.val);
	                }
	               if(node.left != null)
	               {
	                   queue.add(node.left);
	               }
	                if(node.right != null)
	                {
	                    queue.add(node.right);
	                }
	                
	            }
	        	else
	        	{
	        		res.add(temp);
	        		temp = new LinkedList<Integer>();
	        		if(queue.size() > 0)
	        		{
	        			queue.addLast(null);
	        		}
	        		rtol = !rtol;
	        	}
	            
	            
	        }
	        return res;
	        
	    }
	    
	    public List<List<Integer>> zigzagLevel(TreeNode root)
	    {
	    	ArrayList<List<Integer>> res = new ArrayList<>();
			if(root == null)
			{
				return res;
			}
			
	    Queue<TreeNode102> queue = new LinkedList<TreeNode102>();
	    queue.add(root);
	    boolean flag = false;
	    
	    while(!queue.isEmpty())
	    {
	    	int numnodes = queue.size();//change
	    	List<Integer> temp = new ArrayList<>();//change
	    	for(int i=0; i< numnodes;i++)
	    	{
	    	    TreeNode102 node = queue.remove();
	    	    temp.add(node.getData());//change

	    	        if(node.getLeftChild() != null)
	    	        {
	    		      queue.add(node.getLeftChild());
	    		    }
	    	        if(node.getRightChild() != null)
	    	        {
	    		       queue.add(node.getRightChild());
	    	        }
	    	 }
	    	if(flag)
	    	{
	    		Collections.reverse(temp);	    		
	    	}
	    	flag = !flag;
	    
	    	res.add(temp);//change
	    }
	    return res;
	    
}
	    
	}}
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

