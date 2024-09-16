package IK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]//list of list
All the integers of nums are unique.

in place of nums i am taking array of char'a''b''c'
*/

public class PermutationsABC {
	
	public static void backtrack(int n, ArrayList<Character> nums,List<List<Character>> output, int first)
	{
		//if all integers are used up
		if(first == n)//if first will run 0,1,2 index the check first that is 3 == length of array
		{
			output.add(new ArrayList<Character>(nums));
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
	
	public static List<List<Character>> permute(char[] arr)
	{
	 // init output list
     List<List<Character>> output = new LinkedList();
     
   //convert nums into list since the output is a list of lists
     ArrayList<Character> arr_list = new ArrayList<>();
     for(Character c: arr)
     {
    	 arr_list.add(c);  	 
     }
     int n = arr.length;
     backtrack(n,arr_list,output,0);//0->first
     return output;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Char[] str = {'A', 'B', 'C'};
		char[] arr = {'a','b','c'};
		List<List<Character>> result = permute(arr);
		for(List<Character> i: result)
		{
			System.out.println(i);
		}
		

	}

}
