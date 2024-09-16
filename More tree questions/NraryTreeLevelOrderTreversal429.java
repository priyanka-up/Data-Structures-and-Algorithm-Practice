package ikTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import examples.DoublyLinkedList.Node;

public class NraryTreeLevelOrderTreversal429 {
	
	private TreeNode429 root;
	ArrayList<Integer> result = new ArrayList<>();
		
		public TreeNode429 getRoot()
		{
			return root;
		}
		
		public void setRoot(TreeNode429 root)
		{
			this.root = root;
		}
		public boolean isEmpty()
		{
			return root == null;
		}
		

		public ArrayList<Integer> bfsTemplate(TreeNode429 root)
		{//basic template for all tree level order treversal
			if(root == null)
			{
				return result;
			}
			
	    Queue<TreeNode429> queue = new LinkedList<TreeNode429>();
	    queue.add(root);
	    
	    while(!queue.isEmpty())
	    {
	    	TreeNode429 node = queue.remove();
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
		
	public ArrayList<List<Integer>> nraryTreeLevelTreversal(TreeNode429 root)
	{//bfs
	   ArrayList<List<Integer>> res = new ArrayList<>();
			if(root == null)
			{
				return res;
			}
			
	    Queue<TreeNode429> queue = new LinkedList<TreeNode429>();
	    queue.add(root);
	    
	    while(!queue.isEmpty())
	    {
	    	int numnodes = queue.size();//change
	    	List<Integer> temp = new ArrayList<>();//change
	    	for (int i = 0; i < numnodes; i++) {

	    		TreeNode429 node = queue.remove();
	    		temp.add(node.getData());
	    		if(node.children != null)
	    		{
	    			for (TreeNode429 child : node.children) {
	    	        queue.add(child);
	    	        }
	    		}
                
            }

	    	res.add(temp);//change
	    	}

	    return res;
	}
	/*
	//find the max height of the tree
	//top down dfs
	class Solution {
	    static int height =0;
	    public int maxDepth(Node root) {
	        
	        dfs(root, 1);
	        return height;
	    }
	    public static void dfs(Node root, int level)
	    {
	        if(root == null)
	        {
	            return;
	        }
	        height = Math.max(height, level);
	        
	        for(Node child:  root.children)
	        {
	            dfs(child,level + 1);
	        }
	    }
	}
	Width w -> max no of nodes at any level
Height h -> h = log n(base k) in k ary tree //and if it is binary tree the it would be logn(base 2)
So range of this height will be logn(base k) <= h<=n

o(n) time  : DFS : o(h)space
o(n) space : BFS : o(w) space//max no of nodes at any level
	*/
	
	//bottom up dfs
	int height = 0;
	int overall (root)
	{
		return dfs(root);
	}
	int dfs(root)
	{
		if(root == null ||root.left == null || root.right == null)
		{
			return 0;
		}
		for(int i=0;i<root.child.size();i++)
		{
			height= Math.max(height,dfs(root.child(i)));
		}
		return 1+height;
	}
	
		
		public void printTree(TreeNode429 current) 
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
				root = new TreeNode429(value);
				return true;			
			}
			
			TreeNode429 currentNode = root;
			while(currentNode != null)
			{
				TreeNode429 leftChild = currentNode.getLeftChild();
				TreeNode429 rightChild = currentNode.getRightChild();
				
				//If the value to insert is less than root value then move to left subtree
				//else move to right subtree of root
				//and before moving check if the subtree is null, if it's then insert the value.
				
				if(currentNode.getData() > value)
				{
					if(leftChild == null)
					{
						leftChild =  new TreeNode429(value);
						currentNode.setLeftChild(leftChild);
						return true;
					}
					currentNode = leftChild;				
				}
				else
				{
					if(rightChild == null)
					{
						rightChild = new TreeNode429(value);
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
 * /*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
			if(root == null)
			{
				return res;
			}
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
	    while(!queue.isEmpty())
        {
            int numnodes = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < numnodes; i++)
            {
                Node node = queue.remove();
	    		temp.add(node.val);
                if(node.children != null)
	    		{
	    			for (Node child : node.children) 
                    {
	    	        queue.add(child);
	    	        }
	    		}
            }
            res.add(temp);
        }
        //Collections.reverse(res);
        return res;        
    }
}
*/
