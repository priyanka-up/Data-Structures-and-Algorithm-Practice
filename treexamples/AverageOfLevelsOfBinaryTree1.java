//The dfs is tedious. Let's use only one queue.
package treexamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsOfBinaryTree1 {
	
	public static List<Double> findAverageOfEachLevel(Node root)
	{
	
		List<Double> res = new ArrayList<>();
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			long count = queue.size();
			long sum =0;
			for(long i=0; i<count; i++)
			{
				Node n = queue.remove();
				sum = sum + n.getData();
				if(n.getLeftChild() != null)
				{
					queue.add(n.getLeftChild());
				}
				if(n.getRightChild() != null)
				{
					queue.add(n.getRightChild());
				}
			}
			
			res.add(sum * 1.0 /count);
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
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
			
			System.out.println(findAverageOfEachLevel(tree.getRoot()));
			

	}

}
