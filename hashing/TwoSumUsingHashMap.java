package hashing;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSumUsingHashMap {
	
	public static int[] findSum(int[] arr, int target)
	{
		HashSet<Integer> hset = new HashSet<>();
		int[] result = new int[2];
		
		for(int i : arr)
		{
			if(hset.contains(target - i))
			{
				result[0] = i;
				result[1] = target - i;
				break;
			}
			hset.add(i);
		}
		System.out.println(Arrays.toString(result));
		return result;
 	}
	
	/*public static int[] findSum(int[] arr, int n) {
		  int[] result = new int[2];
		  HashMap < Integer, Boolean > hmap = new HashMap < Integer, Boolean > (); // Create a hashmap

		  for (int i = 0; i < arr.length; i++) {
		   if (hmap.containsKey(arr[i])) // If a value from arr is present in hmap
		   {
		    result[0] = arr[i];
		    result[1] = n - arr[i];
		    return result;
		   }
		   else
		   hmap.put(n - arr[i], true); // Store value - arr[i] if element is not present in arr
		  }
		  return result;
		 }
		 
		 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
		int target = 27;
		
		int[] result = findSum(arr, target);
		int num1 = result[0];
	    int num2 = result[1];
	    
	    if(num1 + num2 == target)
	    {
	    	System.out.println(result[0]);
	    	System.out.println(result[1]);
	    	
	    }
	    else
	    {
	    	System.out.println("element not found");
	    }
		
		}

	}


