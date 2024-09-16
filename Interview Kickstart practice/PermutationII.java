package IK;
import java.util.*;
/*Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
*/
public class PermutationII {
	
	public static List<List<Integer>> permuteUnique(int[] nums)
	{
		List<List<Integer>> result = new ArrayList<>();
		
		//count the occurrence of each no
		HashMap<Integer,Integer> counter = new HashMap<>();
		for(int num : nums)
		{
			if(!counter.containsKey(num))
				counter.put(num, 0);
			counter.put(num, counter.get(num) + 1);
		}
		
		LinkedList<Integer> comb = new LinkedList<>();
		backtrack(nums.length,counter,comb,result);
		return result;
		
	}
	public static void backtrack(int n, 
			HashMap<Integer, Integer> counter,
			LinkedList<Integer> comb,
			List<List<Integer>> result)
	{
	if(comb.size() == n)
	{
		result.add(new ArrayList<Integer>(comb));
		return;
	}
	
	for(Map.Entry<Integer, Integer> entry: counter.entrySet())
	{
		Integer num = entry.getKey();
		Integer count = entry.getValue();
		if(count == 0)
		{
			continue;
		}
		//add this number into the comb(current combination)//whose count = 0
		comb.addLast(num);
		counter.put(num, count-1);
		
		//backtrack
		backtrack(n,counter,comb,result);
		
		//delete the entry(revert the choice for the next exploration)
		comb.removeLast();
		counter.put(num, count);
		
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] nums = {1,1,2};
	List<List<Integer>> result =  permuteUnique(nums);
	for(List<Integer> num: result)
	{
		System.out.println(num);
	}

	}

}
