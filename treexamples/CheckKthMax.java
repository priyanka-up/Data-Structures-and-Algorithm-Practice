package treexamples;

public class CheckKthMax {
	
	public static int findKthMax(Node root, int k)
	{
		//perform inorder traversal to get sorted array
		//return value at index [length - k]
		
		StringBuilder result = new StringBuilder();
		result = inOrderTraversal(root, result);
		
		String array[]=result.toString().split(",");//spliting string into array of string
		if((array.length - k) >= 0)
			return Integer.parseInt(array[array.length -k]);	
		
		return -1;
	}
	
	public static StringBuilder inOrderTraversal(Node root, StringBuilder result)
	{
		if(root.getLeftChild() != null)
			inOrderTraversal(root.getLeftChild(), result);
		result.append(root.getData() + ",");
		if(root.getRightChild() != null)
			inOrderTraversal(root.getRightChild(), result);
		return result;
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
		
		System.out.println(findKthMax(bst.getRoot(), 3));
	}
	

}
