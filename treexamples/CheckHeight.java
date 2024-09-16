package treexamples;

//here we return -1 if the given node is none then we call the findheightRecurs function on lst and rst that return the 
//the one that has a greater value plus 1

public class CheckHeight {
	
	public static int findheightRecurs(Node root)
	{
		if(root == null)
			return -1;
		else
			return 1+ Math.max(findheightRecurs(root.getLeftChild()), findheightRecurs(root.getRightChild()));
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
		//tree.add(10);
		//tree.add(14);
		
		System.out.println(findheightRecurs(tree.getRoot()));
	}

}
