package IK;

import java.util.*;

/*
 * So, this time let us loop over the length of combination, rather than the candidate numbers, 
 * and generate all combinations for a given length with the help of backtracking technique.
 * 
 * 
 * We define a backtrack function named backtrack(first, curr) which takes the index of first element to add and a current combination as arguments.
   If the current combination is done, we add the combination to the final output.

     Otherwise, we iterate over the indexes i from first to the length of the entire sequence n.
     
Add integer nums[i] into the current combination curr.

Proceed to add more integers into the combination : backtrack(i + 1, curr).

Backtrack by removing nums[i] from curr.

Time complexity:{O}(N * 2^N) to generate all subsets and then copy them into output list.

Space complexity:{O}(N). We are using O(N) space to maintain curr, and are modifying curr in-place with backtracking. 
Note that for space complexity analysis, we do not count space that is only used for the purpose of returning output,
 so the output array is ignored.
 */

public class SubSets {
	static int n,k;
	static List<List<Integer>> output = new ArrayList();
	
	public static void backtrack(int first, ArrayList<Integer> curr, int[] nums)
	{
		if(curr.size() == k)
		{
			output.add(new ArrayList(curr));
			return;
		}
		for(int i= first; i<n; i++)
		{
			curr.add(nums[i]);
			backtrack(i+1,curr,nums);
			curr.remove(curr.size()-1);
		}
	}
	
	public static List<List<Integer>> subsets(int[] nums)
	{
		n = nums.length;
		int first =0;
		
		for(k=0;k<= n-1; k++)
		{
			backtrack(first, new ArrayList<Integer>(), nums);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		List<List<Integer>> result =subsets(nums);
		for(List<Integer> num: result)
		{
			System.out.println(num);
		}

	}

}
