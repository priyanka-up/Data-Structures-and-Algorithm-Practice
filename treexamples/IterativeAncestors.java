package treexamples;

//search for k in bst untill a null node or k itself is reached.if k is reached , the ancestors are returned otherwise 
//empty string is returned.

public class IterativeAncestors {
	
	public static String findAncestors(Node root, int k)
	{
		String result = "";
		Node tempNode = root;
		
		while(tempNode != null && tempNode.getData() != k)
		{
			result =result + tempNode.getData() + ",";
			if(k <= tempNode.getData())
				tempNode = tempNode.getLeftChild();
			else
				tempNode = tempNode.getRightChild();
		}
		
		if(tempNode == null)
			return "";
		
		return result;
	}
	
	
	public static void main(String args[])
	{
		binaryTree tree = new binaryTree();
		
		tree.add(6);
		tree.add(4);
		tree.add(9);
		tree.add(2);
		tree.add(5);
		tree.add(8);
		tree.add(12);
		tree.add(10);
		tree.add(14);
		
		int k = 10;
		System.out.println(findAncestors(tree.getRoot(), k));
	}

}
