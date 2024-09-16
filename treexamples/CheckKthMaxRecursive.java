package treexamples;

public class CheckKthMaxRecursive {
	static int counter;
	
	public static int findKthMaxRecur(Node root, int k)
	{
		counter =0;
		Node node = findKthMaxR(root, k);
		if(node != null)
			return node.getData();
		return -1;
	}
	
	public static Node findKthMaxR(Node root, int k)
	{
		if(root == null) {
			return null;			
		}
		//reach the right most node
		Node node = findKthMaxR(root.getRightChild(), k);
		
		if(counter != k)
		{
			//increment counter if kth element is not found
			counter++;
			node = root;
		}
		
		//base condition reached as kth element is found
		if(counter == k)
		{
			return node;
		}
		else
			//traverse left child if kth element is not reached
			return findKthMaxR(root.getLeftChild(), k);
				
	}
	
	
	public static void main(String args[])
	{
		binaryTree bst = new binaryTree();
		
		bst.add(6);
		bst.add(4);
		bst.add(9);
		bst.add(5);
		bst.add(2);
		bst.add(8);
		
		System.out.println(findKthMaxRecur(bst.getRoot(), 3));
	}

}
