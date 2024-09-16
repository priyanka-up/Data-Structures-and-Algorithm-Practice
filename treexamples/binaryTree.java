package treexamples;

import java.util.LinkedList;
import java.util.List;

public class binaryTree {
	
	private Node root;
	
	public Node getRoot()
	{
		return root;
	}
	
	public void setRoot(Node root)
	{
		this.root = root;
	}
	public boolean isEmpty()
	{
		return root == null;
	}
	//iterative function to add a new value in BST
	
	public boolean add(int value)
	{
		if(isEmpty())
		{
			root = new Node(value);
			return true;			
		}
		
		Node currentNode = root;
		while(currentNode != null)
		{
			Node leftChild = currentNode.getLeftChild();
			Node rightChild = currentNode.getRightChild();
			
			//If the value to insert is less than root value then move to left subtree
			//else move to right subtree of root
			//and before moving check if the subtree is null, if it's then insert the value.
			
			if(currentNode.getData() > value)
			{
				if(leftChild == null)
				{
					leftChild =  new Node(value);
					currentNode.setLeftChild(leftChild);
					return true;
				}
				currentNode = leftChild;				
			}
			else
			{
				if(rightChild == null)
				{
					rightChild = new Node(value);
					currentNode.setRightChild(rightChild);
					return true;
				}
				currentNode = rightChild;
			}
		}
		return false;
	}
	
	public Node search(int value)
	{
		
		if(isEmpty())
			return null;
		
		Node currentNode = this.root;
		
		while(currentNode != null)
		{
			if(currentNode.getData() == value)
				return currentNode;
			if(currentNode.getData() > value)
				currentNode = currentNode.getLeftChild();
			else
				currentNode = currentNode.getRightChild();				
		}	
		System.out.println(value + " Not found in the Tree!");
		return null;
	}
	
	public Node searchR(int value)
	{
		if(isEmpty())
			return null;
		return searchRecursive(root, value);
	}
	
	public Node searchRecursive(Node currentNode , int value)
	{
		//tree is empty
		if(currentNode == null || currentNode.getData() == value)
		{
			return currentNode;
		}
		if(currentNode.getData() > value)
		{
			return searchRecursive(currentNode.getLeftChild(), value);
		}
		else
			return searchRecursive(currentNode.getRightChild(), value);
	}
	
	
	/*public boolean delete(int value, Node currentNode)
	{
		//if there is no node present in the tree 
		if(root == null)
			return false;
		
		//
		Node parent = null;
		if(currentNode != null && (currentNode.getData() != value))
		{
			parent = currentNode; // to store parent of currentNode
			if(currentNode.getData() > value)
			{
				currentNode = currentNode.getLeftChild();
			}
			else
			{
				currentNode = currentNode.getRightChild();
			}
		}
		
		//if currentNode == null
		if()
		
		
	}*/
	
	
	//in binary search tree, all values in current node's left subtree are smaller than the current node's value. so keep traversing towards left 
	//till you reach leaf node and then you return leaf node's value.
	//iterative approach
	public  int findmin(Node root)
	{
		if(root == null)
		{
			return -1;
		}
		while(root.getLeftChild() != null)
		{
			root = root.getLeftChild();
		}
		return root.getData();
		
	}
	
	//In this solution, we check if the root is NULL, if it is, NULL is returned. Otherwise, we check to see if the left child of the current node is NULL,
	//if it is, then this root is the leftmost node and so we return the value there. If a left node exists, we call the findMin() function on it.
	public  int findminRecursive(Node root)
	{
		if(root == null)
			return -1;
		else if(root.getLeftChild() == null)
			return root.getData();
		else
			return findminRecursive(root.getLeftChild());
	}
	

	public void printTree(Node current) 
    {
		if (current == null) return;

		printTree(current.getLeftChild());
		System.out.print(current.getData() + ",");

		printTree(current.getRightChild());

	}
	
	public List<Integer> printPreOrder(Node current)
	{
		System.out.println("hihihih");
		LinkedList<Node> stack = new LinkedList<>();
	    LinkedList<Integer> output = new LinkedList<>();
	    if (root == null) {
	      return output;
	    }

	    stack.add(root);
	    while (!stack.isEmpty()) {
	      Node node = stack.pollLast();
	      output.add(node.getData());
	      if (node.getRightChild() != null) {
	        stack.add(node.getRightChild());
	      }
	      if (node.getLeftChild() != null) {
	        stack.add(node.getLeftChild());
	      }
	    }
	    System.out.println(output);
	    return output;
	  }
	
	public List<Integer> printInOrder(Node current)
	{
		System.out.println("hi");
		LinkedList<Node> stack = new LinkedList<>();
		LinkedList<Integer> output = new LinkedList<>();
		
		if(root == null)
			return output;
		
		//stack.add(root);
		Node curr = root; //initialize current as root 
		while(!stack.isEmpty() && curr != null) // while curr is not null and stack is not empty 
		{
			while(curr != null)
			{
			stack.push(curr);
			curr = curr.getLeftChild(); //if curr have left child 
		    }
			curr = stack.pop();
			output.add(curr.getData());
		    curr = curr.getRightChild();//move to the right node
			
		}
		System.out.println(output);
		return output;
	}
	
	public List<Integer> printPostOrder(Node Current)
	{
		LinkedList<Node> stack = new LinkedList<>();
		LinkedList<Integer> output = new LinkedList<>();
		
		if(root == null)
			return null;
		
	    Node curr = root;
		Node prev = null;
		while(curr != null || !stack.isEmpty()) {
			if(curr != null)
			{
				stack.push(curr);
				curr = curr.getLeftChild();
			}
			else
			{
				Node temp = stack.peek();
				if(temp.getRightChild() != null && temp.getRightChild() != prev)
				{
					curr = temp.getRightChild();
				}
				else
				{
					output.add(temp.getData());
					stack.pop();
					prev = temp;
				}
			}
			
		}
		
		return output;
	}
	
	//find depth
	public int maxDepth(Node root)
	{
		if(root == null)
			return 0;
		int left = maxDepth(root.getLeftChild());
		int right = maxDepth(root.getRightChild());
		
		return Math.max(left, right) + 1;
		
	}
	
	public List<Double> averageOfLevels(Node root)
	{
		if(root == null)
			return null;
		while(root != null)
		{
			Double ave = (double) ((root.getLeftChild().getData() + root.getRightChild().getData())/2);
			
		}
	}
	
	}
	


