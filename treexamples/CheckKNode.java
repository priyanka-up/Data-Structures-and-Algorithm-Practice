package treexamples;

public class CheckKNode {
	
	public static String findAllKthNode(Node root, int k)
	{
		StringBuilder result = new StringBuilder();
		result = findNode(root, k, result);
		return result.toString();
	}
	
	//Helper recursive function to traverse tree and append all the nodes 
	  // at k distance into result StringBuilder
	public static StringBuilder findNode(Node root, int k, StringBuilder result)
	{
		if(root == null)
			return null;
		
		if(k==0)
		{
			return result.append(root.getData()+ ",");
		}
		else
		{
		     //Decrement k at each step till you reach at the leaf node 
		      // or when k == 0 then append the Node's data into result string
			findNode(root.getLeftChild(), k-1,result);
			findNode(root.getRightChild(), k-1, result);
		}
		return result;
		
	}
	
	public static void main(String args[])
	{
		int k=2;
		binaryTree tree = new binaryTree();		
		tree.add(6);
		tree.add(4);
		tree.add(9);
		tree.add(2);
		tree.add(5);
		tree.add(8);
		tree.add(12);
		
		System.out.println(findAllKthNode(tree.getRoot(),k));
	}

}
