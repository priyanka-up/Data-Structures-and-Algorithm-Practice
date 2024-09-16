package IK;
import java.util.HashMap;

/*if the array is already sorted then use two pointer approach 
if the array is not sorted then do presoring by libarary function in o(nlog n )  time + two pointer pass o(n)= o(nlog n)
if we allow to use auxalary space the we can use hash map that is representation(invoke an external data dtructure) change o(1)
if we dont allow to use auxalary space then do the internally presort the array which would take little more time but use less apce

*/
public class TwoSumHashMap {
	
	public static void main(String args[])
	{
		int[] arr = twopass();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		
	}

	private static int[] twopass() {	
		//create hashmap first
		int[] nums = {1,4,5,6,7,10};
		int target = 11;
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for(int i=0; i< nums.length; i++)
		{
			hmap.put(nums[i], i);
			//System.out.println(nums[i]);
		}
		
		//loop through each element 
		
		for(int i=0; i<nums.length; i++)
		{
			int element = target - nums[i];
			if(hmap.containsKey(element) && hmap.get(element) != i)
			{
				return new int[] {i, hmap.get(element)};
			}
		}
		
		throw new IllegalArgumentException("No two sum solution");
		
		//return null;
	}

}
