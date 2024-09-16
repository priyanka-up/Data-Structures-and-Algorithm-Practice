/*
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 */

package ikTree;
import java.util.*;
//no of nodes so m taking the snapshorts that tells me for how many times that paerticulat block is executed

import treexamples.Node;

public class BinaryTreeLevelOrderTreversal102 {

private TreeNode102 root;
ArrayList<Integer> result = new ArrayList<>();
	
	public TreeNode102 getRoot()
	{
		return root;
	}
	
	public void setRoot(TreeNode102 root)
	{
		this.root = root;
	}
	public boolean isEmpty()
	{
		return root == null;
	}
	

	public ArrayList<Integer> bfsTemplate(TreeNode102 root)
	{//basic template for all tree level order treversal
		if(root == null)
		{
			return result;
		}
		
    Queue<TreeNode102> queue = new LinkedList<TreeNode102>();
    queue.add(root);
    
    while(!queue.isEmpty())
    {
    	TreeNode102 node = queue.remove();
    	result.add(node.getData());
    	if(node.getLeftChild() != null)
    	{
    		queue.add(node.getLeftChild());
    	}
    	if(node.getRightChild() != null)
    	{
    		queue.add(node.getRightChild());
    	}
    }
    return result;
    

		
	}
	
public ArrayList<List<Integer>> binaryTreeLevelTreversal(TreeNode102 root)
{
   ArrayList<List<Integer>> res = new ArrayList<>();
		if(root == null)
		{
			return res;
		}
		
    Queue<TreeNode102> queue = new LinkedList<TreeNode102>();
    queue.add(root);
    
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
        
    	res.add(temp);//change
    
    }
	return res;
		
}
	
	public void printTree(TreeNode102 current) 
    {
		if (current == null) return;

		printTree(current.getLeftChild());
		System.out.print(current.getData() + ",");

		printTree(current.getRightChild());

	}
	
	public boolean add(int value)
	{
		if(isEmpty())
		{
			root = new TreeNode102(value);
			return true;			
		}
		
		TreeNode102 currentNode = root;
		while(currentNode != null)
		{
			TreeNode102 leftChild = currentNode.getLeftChild();
			TreeNode102 rightChild = currentNode.getRightChild();
			
			//If the value to insert is less than root value then move to left subtree
			//else move to right subtree of root
			//and before moving check if the subtree is null, if it's then insert the value.
			
			if(currentNode.getData() > value)
			{
				if(leftChild == null)
				{
					leftChild =  new TreeNode102(value);
					currentNode.setLeftChild(leftChild);
					return true;
				}
				currentNode = leftChild;				
			}
			else
			{
				if(rightChild == null)
				{
					rightChild = new TreeNode102(value);
					currentNode.setRightChild(rightChild);
					return true;
				}
				currentNode = rightChild;
			}
		}
		return false;
	}
}
	
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
 *
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
		if(root == null)
		{
			return res;
		}
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
	    while(!queue.isEmpty())
        {
            int numnodes = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < numnodes; i++)
            {
                TreeNode node = queue.remove();
	    		temp.add(node.val);

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
        Collections.reverse(res);
        return res;        
    }
}
        

	 */
	

