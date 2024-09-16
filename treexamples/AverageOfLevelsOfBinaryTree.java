//Depth First Search
package treexamples;

import java.util.*;

//count list :refers to the total no of nodes at ith level
//res list: refers to the sum of the nodes at ith level
//t : t is the node at each level
//i : level

public class AverageOfLevelsOfBinaryTree {
	
	public static List<Double> findAverageOfEachLevel(Node root)
	{
		List<Double> res = new ArrayList<>();
		List<Integer> count = new ArrayList<>();
		average(root, 0, res, count);
		for(int i=0; i< res.size(); i++)
		{
			res.set(i, res.get(i)/count.get(i));
		}
		return res;
	}
	
	public static void average(Node root, int level, List<Double> res, List<Integer> count)
	{
		if(root == null)
			return;
		if(level < res.size())
		{
			res.set(level, res.get(level) + root.getData());
			count.set(level, count.get(level) + 1);
		}
		else
		{
			res.add(1.0 * root.getData());
			count.add(1);
		}
		
		average(root.getLeftChild(), level + 1, res, count);
		average(root.getRightChild(), level + 1, res, count);
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
		
		System.out.println(findAverageOfEachLevel(tree.getRoot()));
		
	}

}


/*
 * Add the value of the current node to the resres(or sumsum) at the index corresponding to the current level. Also, increment the countcount at the index corresponding to the current level.

Call the same function, average, with the left and the right child of the current node. Also, update the current level used in making the function call.

Repeat the above steps till all the nodes in the given tree have been considered once.

Populate the averages in the resultant array to be returned.

Time complexity : O(n)O(n). The whole tree is traversed once only. Here, nn refers to the total number of nodes in the given binary tree.

Space complexity : O(h)O(h). resres and countcount array of size hh are used. Here, hh refers to the height(maximum number of levels) of the given binary tree. Further, the depth of the recursive tree could go upto hh only.


 */
