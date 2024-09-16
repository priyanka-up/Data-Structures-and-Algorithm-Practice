package ikTree;

import java.util.ArrayList;
import java.util.List;

public class mainTree {
	//@SuppressWarnings("null")
	public static void main(String args[])
	{
		/*BinaryTreeLevelOrderTreversal102 node = new BinaryTreeLevelOrderTreversal102();
		node.add(3);
		node.add(9);
		node.add(20);
		//node.add((Integer) null);
		//node.add(null);
		node.add(15);
		node.add(7);
		
		
		
		node.printTree(node.getRoot());
		System.out.println("hello");
		
		node.binaryTreeLevelTreversal(node.getRoot());
		node.printTree(node.getRoot());
		System.out.println("hi");*/
		
		NraryTreeLevelOrderTreversal429 node1 = new NraryTreeLevelOrderTreversal429();
		node1.add(3);
		node1.add(9);
		node1.add(20);
		//node.add((Integer) null);
		//node.add(null);
		node1.add(15);
		node1.add(7);
		
		//node1.printTree(node1.getRoot());
		//System.out.println("hi");
		ArrayList<List<Integer>> res = node1.nraryTreeLevelTreversal(node1.getRoot());

		for(List<Integer> l : res)
		{
			for(int i : l)
			{
				System.out.println(i + ",");
			}
			System.out.println(" ");
		}
		
	}
		
	}


