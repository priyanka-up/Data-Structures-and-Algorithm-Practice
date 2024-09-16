package IK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]//list of list
All the integers of nums are unique.
*/

/*
 * Here is a backtrack function which takes the index of the first integer to consider as an argument backtrack(first).

If the first integer to consider has index n that means that the current permutation is done.
Iterate over the integers from index first to index n - 1.
Place i-th integer first in the permutation, i.e. swap(nums[first], nums[i]).
Proceed to create all permutations which starts from i-th integer : backtrack(first + 1).
Now backtrack, i.e. swap(nums[first], nums[i]) back.

 */
public class Permutations46 {
	
	public static void backtrack(int n, ArrayList<Integer> nums,List<List<Integer>> output, int first)
	{
		//if all integers are used up
		if(first == n)//if first will run 0,1,2 index the check first that is 3 == length of array
		{
			output.add(new ArrayList<Integer>(nums));
		}
		for(int i=first; i<=n-1; i++)
		{
		   //place 1,2,3 at oth index one at a time 
			Collections.swap(nums, first, i);
		   //go down in the hierarchy now look for the 1st index 
			backtrack(n,nums, output, first + 1);
			//swap and make a original string again
			Collections.swap(nums, first, i);
			
			
		}
	}
	
	public static List<List<Integer>> permute(int[] nums)
	{
	 // init output list
     List<List<Integer>> output = new LinkedList();
     
     //convert nums into list since the output is a list of lists
     ArrayList<Integer> nums_list = new ArrayList<>();
     for(int num: nums)
     {
    	 nums_list.add(num);  	 
     }
     int n = nums.length;
     backtrack(n,nums_list,output,0);//0->first
     return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3};
		List<List<Integer>> result = permute(nums);
		for(List<Integer> i: result)
		{
			System.out.println(i);
		}

	}

}
