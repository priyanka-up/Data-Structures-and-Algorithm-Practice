package treexamples;

public class mainTree {
	public static void main(String args[])
	{
		binaryTree node = new binaryTree();
		/*node.add(6);
		node.add(4);
		node.add(2);
		node.add(8);
		node.add(9);*/
		
		node.add(6);
		node.add(4);
		node.add(9);
		node.add(5);
		node.add(2);
		node.add(8);
		node.add(12);
		node.add(10);
		node.add(14);
		
		int temp1 = node.findminRecursive(node.getRoot());
		
			System.out.println("\n" + temp1+ " found in Tree !");
		
		
		System.out.println();

		node.printTree(node.getRoot());
		System.out.println("hello");
		
		Node temp = node.searchR(10);
		if (temp != null) {
			System.out.println("\n" + temp.getData() + " found in Tree !");
		}
		else 
			System.out.println("\n Not found in Tree !");

		temp = node.searchR(8);
		if (temp != null) {
			System.out.println("\n" + temp.getData() + " found in Tree !");
		}
		else 
			System.out.println("\n Not found in Tree !");
		
		
		node.printPostOrder(node.getRoot());
		System.out.println("hellohello");
		
		
		node.printTree(node.getRoot());
		System.out.println("hello");
		
		int depth=node.maxDepth(node.getRoot());
		System.out.println(depth);
  }
		
	}


