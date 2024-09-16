package IK;

import java.util.List;
import java.util.*;

public class SubSetsII {
	
	public static List<List<Integer>> subsetsWithDup(int[] nums)
	{  
		Arrays.sort(nums);
		List<List<Integer>> subsets = new ArrayList<>();
		ArrayList<Integer>  currentSubset = new ArrayList<>();
		subsetsWithDupHelper(subsets,currentSubset,nums,0);
		return subsets;
	}
	
	public static void subsetsWithDupHelper(List<List<Integer>> subsets, ArrayList<Integer> currentSubset,int[] nums, int index)
	{
		subsets.add(new ArrayList<>(currentSubset));

			
		for(int i= index; i<= nums.length-1;i++)
		{
			if(i != index && nums[i] == nums[i-1])
			{
				continue;
			}
			currentSubset.add(nums[i]);
			subsetsWithDupHelper(subsets,currentSubset,nums,i+1);
			currentSubset.remove(currentSubset.size() -1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {0};
		List<List<Integer>> result = subsetsWithDup(nums);
		for(List<Integer> num : result)
		{
			System.out.println(num);
		}

	}
	
	/*
	 * Algorithm

First, sort the array in ascending order.

Use a recursive helper function subsetsWithDupHelper to generate all possible subsets. The subsetsWithDupHelper has the following parameters:

Output list of subsets (subsets).
Current subset (currentSubset).
nums array.
the index in the nums array from where we should start scanning elements at that function call (index).
At each recursive function call:

Add the currentSubset to the subsets list.

Iterate over the nums array from index to the array end.

If the element is considered for the first time in that function call, add it to the currentSubset list. Make a function call to subsetsWithDupHelper with index = current element position + 1.
Otherwise, the element is a duplicate. So we skip it as it will generate duplicate subsets (refer to the figure above).
While backtracking, remove the last added element from the currentSubset and continue the iteration.
Return subsets list.

Here n is the number of elements present in the given array.

Time complexity: O(n*2 power of n)

As we can see in the diagram above, this approach does not generate any duplicate subsets. Thus, in the worst case (array consists of n distinct elements), the total number of recursive function calls will be 2 ^ n2 
n
 . Also, at each function call, a deep copy of the subset currentSubset generated so far is created and added to the subsets list. This will incur an additional O(n) time (as the maximum number of elements in the currentSubset will be nn). So overall, the time complexity of this approach will be O(n \cdot 2 ^ n)O(n⋅2 
n
 ).

Space complexity: O(n)O(n)

The space complexity of the sorting algorithm depends on the implementation of each programming language. For instance, in Java, the Arrays.sort() for primitives is implemented as a variant of quicksort algorithm whose space complexity is O(\log n)O(logn). In C++ sort() function provided by STL is a hybrid of Quick Sort, Heap Sort and Insertion Sort with the worst case space complexity of O(\log n)O(logn). Thus the use of inbuilt sort() function adds O(\log n) to space complexity.

The recursion call stack occupies at most O(n)O(n) space. The output list of subsets is not considered while analyzing space complexity. So, the space complexity of this approach is O(n)O(n).

	 */

}
